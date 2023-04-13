package jp.techacademy.yuya.ozawa.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val person1 = Human()
        person1.say()


        val person2 = Human()
        person2.think()


    }
}