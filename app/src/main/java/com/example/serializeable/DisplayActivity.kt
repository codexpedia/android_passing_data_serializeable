package com.example.serializeable

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_display.*

class DisplayActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val student = intent.getSerializableExtra("StudentInfo") as Student
        tv_name.text = student.name
        tv_age.text = student.age.toString()
    }

    fun backToMain(v: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }
}
