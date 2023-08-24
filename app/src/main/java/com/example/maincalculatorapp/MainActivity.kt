package com.example.maincalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


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

        textViewRes.setOnClickListener {
            val value1 = textView1.text.toString().toFloat()
            val value2 = textView2.text.toString().toFloat()

            val result = performCalculation(value1, value2)
            textViewTotal.text = result.toString()
        }
    }

    private fun performCalculation(value1: Float, value2: Float): Float {
        // Aquí puedes realizar la operación que desees, por ejemplo, suma, resta, etc.

        return operation?.invoke(value1, value2) ?: 0.0f
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
}