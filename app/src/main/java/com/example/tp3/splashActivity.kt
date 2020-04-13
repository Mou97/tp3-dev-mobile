package com.example.tp3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class splashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        val anim = AnimationUtils.loadAnimation(this, R.anim.rotate)
        imageView.startAnimation(anim)

//        splash stuff
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
        }, 3000)

    }
}
