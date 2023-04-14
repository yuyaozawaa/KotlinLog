package jp.techacademy.yuya.ozawa.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val person1 = Human("山田太郎",25,"サッカー")
        person1.say()
        person1.think()


        val person2 = Human("山田花子",10,"ランニング")
        person2.say()
        person2.think()


    }
}