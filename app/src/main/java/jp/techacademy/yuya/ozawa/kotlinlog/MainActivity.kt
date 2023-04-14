package jp.techacademy.yuya.ozawa.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val person1 = Human("山田太郎",25)
        person1.say()


        val person2 = Human(hobby = "サッカー")
        person2.think()


    }
}