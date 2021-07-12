package jp.techacademy.shiori.tazawa.humanclass

import android.util.Log

class Human: Animal, Thinkable {

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String):super(name, age, hobby){
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say(){
        Log.d("kotlintest","私の名前は" + this.name + "です。年は" + this.age +"歳です。")
    }

    // Thinkableインターフェイスのメソッドをオーバーライド
    override fun think(){
        Log.d("kotlintest","私は" + this.hobby + "について考える。")
    }


}