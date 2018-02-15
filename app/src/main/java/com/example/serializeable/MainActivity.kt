package com.example.serializeable

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submitContent(v: View) {
        val student = Student()
        student.age = Integer.parseInt(et_age.text.toString())
        student.name = et_name.text.toString()

        val intent = Intent(this, DisplayActivity::class.java)
        intent.putExtra("StudentInfo", student)
        startActivity(intent)
    }

    fun resetContent(v: View) {
        et_age.setText("")
        et_name.setText("")
    }
}