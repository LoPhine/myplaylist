package com.example.myplaylist.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import com.example.myplaylist.R
import com.example.myplaylist.data.ItemMusicDataBase

class PlaylistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playlist)

        val recyclerView = findViewById<RecyclerView>(R.id.music_recycler_view)
        val adapter = ItemMusicAdapter()
        recyclerView.adapter = adapter

        val musicItemsList = ItemMusicDataBase().getAll()
        adapter.data = musicItemsList


    }

}