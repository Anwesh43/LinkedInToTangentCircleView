package com.anwesh.uiprojects.linkedintotangentcircleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.intotangentcircleview.InToTangentCircleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        InToTangentCircleView.create(this)
    }
}
