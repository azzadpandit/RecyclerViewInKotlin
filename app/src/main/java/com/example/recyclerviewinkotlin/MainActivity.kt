package com.example.recyclerviewinkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
    }
}