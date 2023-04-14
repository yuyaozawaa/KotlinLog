package jp.techacademy.yuya.ozawa.kotlinlog

import android.util.Log

class Human(name: String = "", age: Int =0 , val hobby: String = "") : Animal(name, age),
    Thinkable {

    override fun say() {
        Log.d("kotlintest", "私の名前は" + name + "です。年は" + age + "歳です。")

    }

    override fun think() {
        Log.d("kotlintest", "私は" + hobby + "について考える")
    }

}
