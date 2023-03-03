package tn.esprit.leagueoflegendrecyclerview.championList

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import tn.esprit.loldatastorage.R

class ChampionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val championPic : ImageView = itemView.findViewById<ImageView>(R.id.champPic)
    val championName : TextView = itemView.findViewById<TextView>(R.id.champName)
    val championRole : TextView = itemView.findViewById<TextView>(R.id.champRole)
    val btnDelete : ImageView = itemView.findViewById(R.id.btnDelete)

}