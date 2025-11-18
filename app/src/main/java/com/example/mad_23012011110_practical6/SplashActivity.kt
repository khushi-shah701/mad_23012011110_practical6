package com.example.mad_23012011110_practical6

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashActivity : AppCompatActivity(),Animation.AnimationListener {
    lateinit var guni_frame_animation:AnimationDrawable
    lateinit var guni_logo:ImageView
    lateinit var anim_grow_spin:Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        guni_logo=findViewById(R.id.img_uvpce)
        guni_logo.setBackgroundResource(R.drawable.uvpce_animation_list)
        guni_frame_animation=guni_logo.background as AnimationDrawable
        anim_grow_spin= AnimationUtils.loadAnimation(this,R.anim.twin_animation)
        anim_grow_spin.setAnimationListener(this)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            guni_frame_animation.start()
            guni_logo.startAnimation(anim_grow_spin)
        }
        else {
            guni_frame_animation.stop()
        }
    }

    override fun onAnimationEnd(animation: Animation?) {
        Intent(this, MainActivity::class.java).also { startActivity(it) }
    }

    override fun onAnimationRepeat(animation: Animation?) {

    }

    override fun onAnimationStart(animation: Animation?) {

    }
}