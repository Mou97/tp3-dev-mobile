package com.example.tp3

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_third.*

class MainActivity : AppCompatActivity() {
    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val case1 :  Case = Case(500, 600, "Lorem ipsum something something", "https://www.amazon.com",R.drawable.pic2)
        val case2 :  Case = Case(300, 400, "Lorem ipsum something something", "https://www.amazon.com",R.drawable.picq)


        imgMain1.setOnClickListener {
            Toast.makeText(this, case1.priceGar.toString(), Toast.LENGTH_LONG).show()
        }

        imgMain1.setOnLongClickListener{

            val intent =  Intent(this , thirdActivity::class.java)
            intent.putExtra("case", case1)

            startActivity(intent)
            return@setOnLongClickListener true
        }

        imgMain2.setOnClickListener{
            Toast.makeText(this, case2.priceGar.toString(), Toast.LENGTH_LONG).show()

        }

        imgMain2.setOnLongClickListener{
            val intent = Intent(this, thirdActivity::class.java)

            intent.putExtra("case", case2)

            startActivity(intent)

            return@setOnLongClickListener true
        }



        // set music
        mediaPlayer = MediaPlayer.create(this, R.raw.song)




    }


    override fun onResume() {
        super.onResume()
        mediaPlayer?.start()
    }

    override fun onPause() {
        super.onPause()
        mediaPlayer?.pause()
    }

}
