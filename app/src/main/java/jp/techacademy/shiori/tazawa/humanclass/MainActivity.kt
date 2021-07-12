package jp.techacademy.shiori.tazawa.humanclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("花子",25,"テニス")
        val human2 = Human("太郎",30,"野球")

        human1.say()
        human1.think()

        human2.say()
        human2.think()
    }
}