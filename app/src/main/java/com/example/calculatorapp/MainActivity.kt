package com.example.calculatorapp

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var myTextView: TextView

    private lateinit var zero: Button
    private lateinit var one: Button
    private lateinit var two: Button
    private lateinit var three: Button
    private lateinit var four: Button
    private lateinit var five: Button
    private lateinit var six: Button
    private lateinit var seven: Button
    private lateinit var eight: Button
    private lateinit var nine: Button
    private lateinit var plusMinus: Button
    private lateinit var decimal: Button
    private lateinit var multiply: Button
    private lateinit var divide: Button
    private lateinit var add: Button
    private lateinit var subtract: Button
    private lateinit var clear: Button
    private lateinit var result: Button
    private lateinit var del: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

         myTextView = findViewById(R.id.tvMain)

          myTextView.text=viewModel.displayText

        zero = findViewById(R.id.button0)

        zero.setOnClickListener {
            viewModel.setNum('0');
            myTextView.text = viewModel.displayText
        }
        one = findViewById(R.id.button1)

        one.setOnClickListener {
            viewModel.setNum('1');
            myTextView.text = viewModel.displayText
        }

        two = findViewById(R.id.button2)
        two.setOnClickListener {
            viewModel.setNum('2');
            myTextView.text = viewModel.displayText
        }

        three = findViewById(R.id.button3)
        three.setOnClickListener {
            viewModel.setNum('3');
            myTextView.text = viewModel.displayText
        }
        four = findViewById(R.id.button4)
        four.setOnClickListener {
            viewModel.setNum('4');
            myTextView.text = viewModel.displayText }

        five = findViewById(R.id.button5)
        five.setOnClickListener {
            viewModel.setNum('5');
            myTextView.text = viewModel.displayText }

        six = findViewById(R.id.button6)
        six.setOnClickListener {
            viewModel.setNum('6');
            myTextView.text = viewModel.displayText }

        seven = findViewById(R.id.button7)
        seven.setOnClickListener {
            viewModel.setNum('7');
            myTextView.text = viewModel.displayText }

        eight = findViewById(R.id.button8)
        eight.setOnClickListener {
            viewModel.setNum('8');
            myTextView.text = viewModel.displayText }

        nine = findViewById(R.id.button9)
        nine.setOnClickListener {
            viewModel.setNum('9');
            myTextView.text = viewModel.displayText }


    add = findViewById(R.id.buttonSum)
    add.setOnClickListener { viewModel.handleOperator('+'); myTextView.text = viewModel.displayText }

    subtract = findViewById(R.id.buttonSub)
    subtract.setOnClickListener { viewModel.handleOperator('-'); myTextView.text = viewModel.displayText }
    multiply = findViewById(R.id.buttonM)
    multiply.setOnClickListener { viewModel.handleOperator('*'); myTextView.text = viewModel.displayText }
    divide = findViewById(R.id.buttonD)
    divide.setOnClickListener { viewModel.handleOperator('/'); myTextView.text = viewModel.displayText }
    decimal = findViewById(R.id.buttonPoint)
    decimal.setOnClickListener { viewModel.onClickDecimal(); myTextView.text = viewModel.displayText }
    plusMinus = findViewById(R.id.sumOsub)
    plusMinus.setOnClickListener { viewModel.onClickPlusMinus(); myTextView.text = viewModel.displayText }
    clear = findViewById(R.id.buttonC)
    clear.setOnClickListener { viewModel.clearAll(); myTextView.text = viewModel.displayText }
    result = findViewById(R.id.buttomEquals)
    result.setOnClickListener { viewModel.calculate(); myTextView.text = viewModel.displayText }
    del = findViewById(R.id.decimal)
    del.setOnClickListener { viewModel.deleteLast(); myTextView.text = viewModel.displayText }

    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        if(newConfig.orientation===Configuration.ORIENTATION_LANDSCAPE){
            myTextView.setPadding(0,0,24,0)
            myTextView.textSize=24f
        }else if (newConfig.orientation===Configuration.ORIENTATION_PORTRAIT){
            myTextView.setPadding(0,24,24,0)
            myTextView.textSize=32f
        }
    }
}
