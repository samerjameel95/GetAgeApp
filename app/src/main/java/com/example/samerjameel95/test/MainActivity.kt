package com.example.samerjameel95.getageapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        exbutton.setOnClickListener(){
            finish();
            System.exit(0);
        }


    }

    fun buClickEvent(view:View){
        try {
            val YOB:Int=etUserYearOfBirth.text.toString().toInt()
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val age = currentYear-YOB
            tvShowAge.text = "Your age is " + age +" years"
        }catch (ex:Exception){
            print("Please enter your birthday year")
        }

        }


}


