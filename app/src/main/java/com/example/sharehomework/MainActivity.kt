package com.example.sharehomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etTxt1: EditText
    lateinit var etTxt2: EditText
    lateinit var etTxt3: EditText
    lateinit var etTxt4: EditText
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var txt5: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etTxt1 = findViewById(R.id.edt1_id)
        etTxt2 = findViewById(R.id.edt2_id)
        etTxt3 = findViewById(R.id.edt3_id)
        etTxt4 = findViewById(R.id.edt4_id)
        btn1 = findViewById(R.id.btn1_id)
        btn2=findViewById(R.id.btn2_id)
        txt5=findViewById(R.id.txt5_id)
        val marraigeRegistation = getSharedPreferences("couples", MODE_PRIVATE)
        btn1.setOnClickListener() {
            val girlName = "Queen"
            val boyName = "king"
            val ageGirl = 22
            val ageBoy = 22.5f
            val proof = "A"
            val YouWantToMarry = true

            marraigeRegistation.edit().putString("GirlName", girlName).apply()
            marraigeRegistation.edit().putString("BoyName", boyName).apply()
            marraigeRegistation.edit().putInt("AgeGirl", ageGirl).apply()
            marraigeRegistation.edit().putFloat("AGE_BOY", ageBoy).apply()
            marraigeRegistation.edit().putString("Proof", proof).apply()
            marraigeRegistation.edit().putBoolean("you_want_to_marry", YouWantToMarry).apply()
//            startActivity(Intent(this, MainActivity2::class.java))

        }
        btn2.setOnClickListener() {

            var girlName = marraigeRegistation.getString("GirlName", "not_match")
            val boyName = marraigeRegistation.getString("BoyName", "match")
            val ageGirl = marraigeRegistation.getInt("AgeGirl", 0)
            var ageBoy = marraigeRegistation.getFloat("AGE_BOY", 20.0f)
            var proof = marraigeRegistation.getString("Proof", "ok")
            var YouWantToMarry = marraigeRegistation.getBoolean("you_want_to_marry", false)

            txt5.text = "$girlName\n$boyName\n$ageGirl\n$ageBoy\n$proof\n$YouWantToMarry"
        }
    }
}