package com.example.sharehomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var btn2: Button
    lateinit var txt5: TextView
//    lateinit var txt6: TextView
//    lateinit var txt7: TextView
//    lateinit var txt8: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btn2=findViewById(R.id.btn2_id)
        txt5=findViewById(R.id.txt5_id)
//        txt6=findViewById(R.id.txt6_id)
//        txt7=findViewById(R.id.txt7_id)
//        txt8=findViewById(R.id.txt8_id)

        val marraigeRegistation=getSharedPreferences("couples", MODE_PRIVATE)

        btn2.setOnClickListener(){

            var girlName=marraigeRegistation.getString("GirlName","not_match")
            val boyName=  marraigeRegistation.getString("BoyName","match")
            val ageGirl=  marraigeRegistation.getInt("AgeGirl",0)
            var ageBoy=marraigeRegistation.getFloat("AGE_BOY",20.0f)
            var proof=marraigeRegistation.getString("Proof","ok")
            var YouWantToMarry=marraigeRegistation.getBoolean("you_want_to_marry",false)

            txt5.text="$girlName\n$boyName\n$ageGirl\n$ageBoy\n$proof\n$YouWantToMarry"
        }
    }
}