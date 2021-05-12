package com.example.recyclerviewinkotlin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val songsObjects = mutableListOf<Song>()
        songsObjects.add(Song("hello","this is my car "))
        songsObjects.add(Song("hello","this is my car "))
        songsObjects.add(Song("hello","this is my car "))
        songsObjects.add(Song("hello","this is my car "))
        songsObjects.add(Song("hello","this is my car "))
        songList.adapter = MyAdapter(songsObjects)
        songList.layoutManager = LinearLayoutManager(this)

        button3.setOnClickListener {
            Toast.makeText(this,"button 1 is clicked ",Toast.LENGTH_SHORT).show()
            //var fr = fragmentManager?.beginTransaction()
            //fr?.replace(R.id.fragment, Fragment_Two())
           // fr?.commit()
//            var fr =
            val transaction = supportFragmentManager.beginTransaction()
            transaction.add(R.id.mainhost, Fragment_sign_in())
            transaction.commit()
        }
    }
}