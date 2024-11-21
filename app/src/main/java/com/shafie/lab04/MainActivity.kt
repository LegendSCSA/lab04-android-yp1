package com.shafie.lab04

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.shafie.lab04.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //the step is used to link the UI created in XML to our Kotlin file
        //3 step
        // Enable {viewBinding} in gradle.kts
        //initialize binding object
        // set content view to binding root
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Bila button yg ber id buttonPlus ditekan
        binding.buttonPlus.setOnClickListener {
            // dapatkan nilai dari editText1 dan editText2 = binding.editText1.text
            // tukarkan ke integer = toInt()
            val num1 = binding.editText1.text.toString().toInt()
            val num2 = binding.editText2.text.toString().toInt()
            //dapatkan hasil tambahkan num1 dan num2
            val sum = num1 + num2;
            //keluarkan result ke textviewdengan id resultTextView
            binding.resultTextView.text = "Result: $sum"
        }

        binding.buttonMinus.setOnClickListener {
            val num1 = binding.editText1.text.toString().toInt()
            val num2 = binding.editText2.text.toString().toInt()
            val minus = num1-num2
            binding.resultTextView.text = "Result: $minus"
        }

        binding.buttonProduct.setOnClickListener {
            val num1 = binding.editText1.text.toString().toInt()
            val num2 = binding.editText2.text.toString().toInt()
            val product = num1 * num2
            binding.resultTextView.text = "Result: $product"
        }

        binding.buttonDivide.setOnClickListener {
            val num1 = binding.editText1.text.toString().toDouble()
            val num2 = binding.editText2.text.toString().toDouble()
            val division = num1 / num2
            binding.resultTextView.text = "Result: $division"
        }

    }
}