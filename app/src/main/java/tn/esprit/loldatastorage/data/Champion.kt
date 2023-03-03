package tn.esprit.leagueoflegendrecyclerview.data

import androidx.room.Entity

const val PICTURE = "PICTURE"
const val NAME = "NAME"
const val ROLE = "ROLE"

// TODO 6 "Change this class to an Entity"
@Entity
data class Champion(

    val id: Int,

    val champPic: Int,

    val champName: String,

    val champRole: String

)