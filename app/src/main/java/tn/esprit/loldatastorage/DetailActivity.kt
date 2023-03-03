package tn.esprit.loldatastorage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import tn.esprit.leagueoflegendrecyclerview.data.*

class DetailActivity : AppCompatActivity() {

    lateinit var championPic : ImageView
    lateinit var championName : TextView
    lateinit var championRole : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        championPic = findViewById(R.id.champPic)
        championName = findViewById(R.id.champName)
        championRole = findViewById(R.id.champRole)

        championPic.setImageResource(intent.getIntExtra(PICTURE, 0))

        val name = intent.getStringExtra(NAME)
        val role = intent.getStringExtra(ROLE)

        title= "$name Detail"

        championName.text = "Name : $name"
        championRole.text = role

    }
}