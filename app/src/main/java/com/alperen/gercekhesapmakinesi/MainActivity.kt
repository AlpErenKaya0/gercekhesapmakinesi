package com.alperen.gercekhesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alperen.gercekhesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

    }
    fun mySum(view:View){
    val number1= binding.numberText.text.toString().toDoubleOrNull()
        val number2=binding.numberText2.toString().toDoubleOrNull()
        if( number1 !=null && number2 !=null){
            val result=number1+number2
            binding.resultText.text = "result: $result"
        }else {
            binding.resultText.text = "Enter valid number!"
        }
    }
    fun mySub(view: View){

    }
    fun myMultiply(view: View){

    }
    fun myDiv(view: View){

    }
    //sadece toplama butonunu tanımladım, 2 sorum var, neden constraint layout gözükmüyor, neden sadece else sorguma giriyor?
}