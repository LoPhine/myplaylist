package com.example.myplaylist.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatDialogFragment
import com.example.myplaylist.R

class MainActivity : AppCompatActivity(), ItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playButton = findViewById<Button>(R.id.play_button)
        playButton.setOnClickListener{
            GoToPlaylist()
        }
    }
    private fun GoToPlaylist(){
        var intent = Intent(this, PlaylistActivity::class.java)
        startActivity(intent)
    }



    override fun onButtonClick(nameMusic: String) {
        val intent: Intent(this@MainActivity, PlaylistActivity::class.java)
        val b = Bundle()
        b.putString('musicName')
    }
}

