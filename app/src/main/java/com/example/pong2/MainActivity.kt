package com.example.pong2

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MyLayout(context: Context) : LinearLayout(context){
    private val myPainter = Paint().apply { color = Color.GREEN }

    init {
        this.setBackgroundColor(Color.BLACK)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.drawRect(0f, 0f, canvas.width.toFloat() / 2, canvas.height.toFloat() / 2, myPainter)

        invalidate()
    }
}

class MainActivity : AppCompatActivity() {
    private lateinit var linearLayout: MyLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        linearLayout = MyLayout(this)
        linearLayout.orientation = LinearLayout.VERTICAL

        val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)

        linearLayout.layoutParams = params
        setContentView(linearLayout)
    }
}