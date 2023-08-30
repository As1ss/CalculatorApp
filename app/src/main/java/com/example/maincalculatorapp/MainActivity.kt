package com.example.maincalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var calcText: String = ""
        var res: Float = 0.0f
        var num1: Float = 0.0f
        var num2: Float = 0.0f

        val textViewTotal = findViewById<TextView>(R.id.tVTotal)
        val textViewSum = findViewById<TextView>(R.id.tVSum)
        val textViewRest = findViewById<TextView>(R.id.tVRest)

        val textViewMult = findViewById<TextView>(R.id.tVMult)
        val textViewDiv = findViewById<TextView>(R.id.tVDiv)
        val textViewRes = findViewById<TextView>(R.id.tVIgual)
        val textView1 = findViewById<TextView>(R.id.tV1)
        val textView2 = findViewById<TextView>(R.id.tV2)
        val textView3 = findViewById<TextView>(R.id.tV3)
        val textView4 = findViewById<TextView>(R.id.tV4)
        val textView5 = findViewById<TextView>(R.id.tV5)
        val textView6 = findViewById<TextView>(R.id.tV6)
        val textView7 = findViewById<TextView>(R.id.tV7)
        val textView8 = findViewById<TextView>(R.id.tV8)
        val textView9 = findViewById<TextView>(R.id.tV9)
        val textView0 = findViewById<TextView>(R.id.tV0)
        val textViewC = findViewById<TextView>(R.id.tVC)
        val textViewDot = findViewById<TextView>(R.id.tVDot)
        val textViewErase = findViewById<TextView>(R.id.tVErase)

        textView1.setOnClickListener {
            if (textViewTotal.text == "0" || calcText == res.toString()) {
                calcText = "1"
            } else
                calcText += "1"
            textViewTotal.text = calcText


        }

        textView2.setOnClickListener {
            if (textViewTotal.text == "0" || calcText == res.toString() || textViewTotal.text == "= $calcText") {
                calcText = "2"
            } else
                calcText += "2"
            textViewTotal.text = calcText
        }

        textView3.setOnClickListener {
            if (textViewTotal.text == "0" || calcText == res.toString() || textViewTotal.text == "= $calcText") {
                calcText = "3"
            } else
                calcText += "3"
            textViewTotal.text = calcText
        }

        textView4.setOnClickListener {
            if (textViewTotal.text == "0" || calcText == res.toString() || textViewTotal.text == "= $calcText") {
                calcText = "4"
            } else
                calcText += "4"
            textViewTotal.text = calcText
        }

        textView5.setOnClickListener {
            if (textViewTotal.text == "0" || calcText == res.toString() || textViewTotal.text == "= $calcText") {
                calcText = "5"
            } else
                calcText += "5"
            textViewTotal.text = calcText
        }

        textView6.setOnClickListener {
            if (textViewTotal.text == "0" || calcText == res.toString() || textViewTotal.text == "= $calcText") {
                calcText = "6"
            } else
                calcText += "6"
            textViewTotal.text = calcText
        }

        textView7.setOnClickListener {
            if (textViewTotal.text == "0" || calcText == res.toString() || textViewTotal.text == "= $calcText") {
                calcText = "7"
            } else
                calcText += "7"
            textViewTotal.text = calcText
        }

        textView8.setOnClickListener {
            if (textViewTotal.text == "0" || calcText == res.toString() || textViewTotal.text == "= $calcText") {
                calcText = "8"
            } else
                calcText += "8"
            textViewTotal.text = calcText
        }

        textView9.setOnClickListener {
            if (textViewTotal.text == "0" || calcText == res.toString() || textViewTotal.text == "= $calcText") {
                calcText = "9"
            } else
                calcText += "9"
            textViewTotal.text = calcText
        }

        textView0.setOnClickListener {
            if (textViewTotal.text == "0" || calcText == res.toString() || textViewTotal.text == "= $calcText") {
                calcText = "0"
            } else
                calcText += "0"
            textViewTotal.text = calcText
        }

        textViewC.setOnClickListener {
            calcText = "0"
            textViewTotal.text = calcText
        }

        textViewDot.setOnClickListener {
            if (textViewTotal.text == "0" || calcText == res.toString() || textViewTotal.text == "= $calcText")
                calcText = "0."
            else if (!calcText.contains('.'))
                calcText += "."
            textViewTotal.text = calcText
        }
        textViewErase.setOnClickListener {
            calcText = eliminarUltimoCaracter(calcText)
            textViewTotal.text = calcText
        }
        textViewSum.setOnClickListener {

            if (calcText.contains('+')) {
                val length = calcText.indexOf('+')
                num1 = calcText.substring(0, length).toFloat()
                num2 = calcText.substring(length + 1, calcText.length).toFloat()
                res = num1 + num2
                textViewTotal.text = res.toString()
                calcText = "${res.toString()}+"

            }
            else if (calcText.isEmpty()){
                textViewTotal.text = "+ $calcText"
            }else {
                calcText += "+"
            }

        }

        textViewRest.setOnClickListener {

            if (calcText.contains('-')) {
                val length = calcText.indexOf('-')
                num1 = calcText.substring(0, length).toFloat()
                num2 = calcText.substring(length + 1, calcText.length).toFloat()
                res = num1 - num2
                textViewTotal.text = res.toString()
                calcText = "${res.toString()}-"
            } else if (calcText.isEmpty()){
                textViewTotal.text = "- $calcText"
            }
            else {
                calcText += "-"
            }
        }
        textViewMult.setOnClickListener {

            if (calcText.contains('*')) {
                val length = calcText.indexOf('*')
                num1 = calcText.substring(0, length).toFloat()
                num2 = calcText.substring(length + 1, calcText.length).toFloat()
                res = num1 * num2
                textViewTotal.text = res.toString()
                calcText = "${res.toString()}*"
            }else if (calcText.isEmpty()){
                textViewTotal.text = "* $calcText"
            } else {
                calcText += "*"
            }
        }
        textViewDiv.setOnClickListener {

            if (calcText.contains('/')) {
                val length = calcText.indexOf('/')
                num1 = calcText.substring(0, length).toFloat()
                num2 = calcText.substring(length + 1, calcText.length).toFloat()
                res = num1 / num2
                textViewTotal.text = res.toString()
                calcText = "${res.toString()}/"
            }
            else if (calcText.isEmpty()){
                textViewTotal.text = "/ $calcText"
            } else{
                calcText += "/"
            }
        }
        textViewRes.setOnClickListener {
            if (calcText.contains('+')) {
                val length = calcText.indexOf('+')
                num1 = calcText.substring(0, length).toFloat()
                num2 = calcText.substring(length + 1, calcText.length).toFloat()
                res = num1 + num2
                textViewTotal.text = res.toString()
                calcText = res.toString()
            } else if (calcText.contains('-')) {
                val length = calcText.indexOf('-')
                num1 = calcText.substring(0, length).toFloat()
                num2 = calcText.substring(length + 1, calcText.length).toFloat()
                res = num1 - num2
                textViewTotal.text = res.toString()
                calcText = res.toString()
            } else if (calcText.contains('*')) {
                val length = calcText.indexOf('*')
                num1 = calcText.substring(0, length).toFloat()
                num2 = calcText.substring(length + 1, calcText.length).toFloat()
                res = num1 * num2
                textViewTotal.text = res.toString()
                calcText = res.toString()
            } else if (calcText.contains('/')) {
                val length = calcText.indexOf('/')
                num1 = calcText.substring(0, length).toFloat()
                num2 = calcText.substring(length + 1, calcText.length).toFloat()
                res = num1 / num2
                textViewTotal.text = res.toString()
                calcText = res.toString()
            } else {
                textViewTotal.text = "= $calcText"
            }


        }
    }

}


fun calc(v1: View, v2: View): ((Float, Float) -> Float)? {

    if (v1 is TextView && v2 is TextView) {
        val n1: Float = v1.text.toString().toFloat()
        val n2: Float = v2.text.toString().toFloat()

        return { n1, n2 -> n1 + n2 }
    } else {
        return null
    }
}

fun eliminarUltimoCaracter(texto: String): String {
    if (texto.isEmpty() || texto == "0") {
        return texto
    }
    return texto.substring(0, texto.length - 1)
}



