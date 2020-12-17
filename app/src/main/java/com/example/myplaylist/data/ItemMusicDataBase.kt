package com.example.myplaylist.data

import android.media.Image
import com.example.myplaylist.R
import com.example.myplaylist.entities.ItemMusic

class ItemMusicDataBase {
    fun getAll(): List<ItemMusic> {
        val musicOne = ItemMusic("Foco,Força e Fé",
                "Projota",
                R.drawable.projota_album)

        val musicTwo = ItemMusic("Ahed by a century",
                "The tragically hip",
                R.drawable.the_tragically_hip_album)

        val musicThree = ItemMusic("A natureza das coisas",
                "Flávio José",
                R.drawable.flavio_jose_album)

        val musicFour = ItemMusic("Blurred Lines",
                "Robin Thicke, T.I., Pharrell Williams",
                R.drawable.robin_thicke_blurred_lines_album)

        val musicFive = ItemMusic("Tudo vai passar",
                "Rael",
                R.drawable.rael_tudo_vai_passar)

        val musicSix = ItemMusic("Cake by the Ocean",
                "DNCE",
                R.drawable.cake_by_the_ocean)

//        val musicSeven= ItemMusic("A cor é rosa",
//                "Silva")
//
//        val musicEight= ItemMusic("Fé",
//                "Oriente")
//
//        val musicNine= ItemMusic("Um pouco mais de fé",
//                "Falamansa")
//
//        val musicTen= ItemMusic("Hoje é dia de ver",
//                "Rael")
//
//        val musicEleven= ItemMusic("Fé na luta",
//                "Gabriel o Pensador")
//
//        val musicTwelve= ItemMusic("O que eu nasci pra ser",
//                "Big Up")
//
//        val musicThirteen= ItemMusic("Serei luz",
//                "Natiruts, Thiaguinho")
//
//        val musicFourteen= ItemMusic("Um dia lindo",
//                "O Rappa")
//
//        val musicFifteen= ItemMusic("In the end",
//                "Linkin Park")

        return listOf(musicOne, musicTwo, musicThree, musicFive, musicSix)
    }

//    musicSeven, musicEight, musicNine, musicTen, musicEleven, musicTwelve, musicThirteen, musicFourteen, musicFifteen
}