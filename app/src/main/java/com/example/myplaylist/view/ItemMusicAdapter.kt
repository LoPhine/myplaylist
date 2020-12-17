package com.example.myplaylist.view

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myplaylist.R
import com.example.myplaylist.entities.ItemMusic

class ItemMusicAdapter: RecyclerView.Adapter<ItemMusicAdapter.MusicItemViewHolder>(){
    var data = listOf<ItemMusic>()
            set(value){
                field = value
                notifyDataSetChanged()
            }

    inner class MusicItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val musicItem: TextView = itemView.findViewById(R.id.musicTextView)
        val singerItem: TextView = itemView.findViewById(R.id.singerTextView)
        val albumItem : ImageView = itemView.findViewById<ImageView>(R.id.albumImageView)


        fun bind(music: String, singer: String, album: Int){
            musicItem.text = music
            singerItem.text = singer
            albumItem.setImageResource(album)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.music_recycle_view, parent, false)
        return MusicItemViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MusicItemViewHolder, position: Int) {
        val itemMusicToShow: ItemMusic = data.get(position)
        holder.bind(itemMusicToShow.music, itemMusicToShow.singer, itemMusicToShow.album)
    }
}