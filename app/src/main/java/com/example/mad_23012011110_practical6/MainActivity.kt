package com.example.mad_23012011110_practical6

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    lateinit var alarmAnimation: AnimationDrawable
    lateinit var heartAnimation: AnimationDrawable
    lateinit var btnCreateAlarm: MaterialButton
    lateinit var btnCancelAlarm: MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val Alarm = findViewById<ImageView>(R.id.clock_anim)
        val Heart = findViewById<ImageView>(R.id.heart_anim)
        btnCreateAlarm = findViewById(R.id.mtrlbtn)
        btnCancelAlarm = findViewById(R.id.mtrlbtn2)
        Alarm.setBackgroundResource(R.drawable.clock_animation)
        Heart.setBackgroundResource(R.drawable.heart_animation)

        alarmAnimation = Alarm.background as AnimationDrawable
        heartAnimation = Heart.background as AnimationDrawable

        btnCreateAlarm.setOnClickListener {
            alarmAnimation.start()
            heartAnimation.start()
        }

        btnCancelAlarm.setOnClickListener {
            alarmAnimation.stop()
            heartAnimation.stop()

    }
}
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            alarmAnimation.start()
            heartAnimation.start()
        } else {
            alarmAnimation.stop()
            heartAnimation.stop()
        }
    }
}