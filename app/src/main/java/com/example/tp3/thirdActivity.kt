package com.example.tp3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_third.*

class thirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val case: Case = intent.getSerializableExtra("case") as Case

        if (case != null){
            imgView1.setImageResource(case.img)

            desc.text = case.description
            link.text = case.link


            radioGroup.setOnCheckedChangeListener{ group , checkedId ->
                val radio : RadioButton = findViewById<RadioButton> (checkedId)
                priceText.text = if (radio.text == "Include garante") case.priceGar.toString() else
                    case.price.toString()
            }
        }


    }
}
