package com.marion.mycalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tillfirstoperand:TextInputLayout
    lateinit var tilsecondoperand:TextInputLayout
    lateinit var etfirstoperand:TextInputEditText
    lateinit var etsecondoperand:TextInputEditText
    lateinit var btnadd:Button
    lateinit var btnsubtract:Button
    lateinit var btnmultiply:Button
    lateinit var btnmodulus:Button
    lateinit var tvanswer :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        addition()
        subraction()
        product()
        modulus()
//        validate()

    }
    fun validate(){
        val firstOperand = etfirstoperand.text.toString()
        val secondOperand = etsecondoperand.text.toString()
        var error = 0
        if (firstOperand.isBlank()){
            tillfirstoperand.error = "First operand is required"
            error += 1
        }
        if (secondOperand.isBlank()){
            tilsecondoperand.error = "Second operand is required"
            error += 1
        }
    }
    fun castViews(){
        tillfirstoperand = findViewById(R.id.tillfirstoperand)
        tilsecondoperand = findViewById(R.id.tilsecondoperand)
        etfirstoperand = findViewById(R.id.etfirstoperand)
        etsecondoperand = findViewById(R.id.etsecondoperand)
        btnadd = findViewById(R.id.btnadd)
        btnsubtract = findViewById(R.id.btnsubtract)
        btnmultiply = findViewById(R.id.btnmultiply)
        btnmodulus = findViewById(R.id.btnmodulus)
        tvanswer = findViewById(R.id.tvanswer)
    }
    private fun addition(){
        btnadd.setOnClickListener {
            clear()
//            validate()
            val firstOperand = etfirstoperand.text.toString().toInt()
            val secondOperand = etsecondoperand.text.toString().toInt()
            val add = firstOperand + secondOperand
            tvanswer.text=add.toString()
        }
    }
    private fun subraction(){
        btnsubtract.setOnClickListener {
            clear()
//            validate()
            val firstOperand = etfirstoperand.text.toString().toInt()
            val secondOperand = etsecondoperand.text.toString().toInt()
            val diff = firstOperand - secondOperand
            tvanswer.text=diff.toString()
        }
    }
    private fun product(){
//        validate()
        btnmultiply.setOnClickListener {
            clear()
            val firstOperand = etfirstoperand.text.toString().toInt()
            val secondOperand = etsecondoperand.text.toString().toInt()
            val product = firstOperand * secondOperand
            tvanswer.text=product.toString()
        }
    }
    private fun modulus(){
        btnmodulus.setOnClickListener {
            clear()
//            validate()
            val firstOperand = etfirstoperand.text.toString().toInt()
            val secondOperand = etsecondoperand.text.toString().toInt()
            val modulo = firstOperand % secondOperand
            tvanswer.text=modulo.toString()
        }
    }
    fun clear(){
        etfirstoperand.error = null
        etsecondoperand.error = null
    }

}