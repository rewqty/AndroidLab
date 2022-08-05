package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<TextView>(R.id.textView)
        val view2 = findViewById<TextView>(R.id.textView2)
        val student = Student("Ivan Ivanov", 3)
        val anotherStudent = Student("Dmitriy", 4)
        view.text = "Проектик"
        view2.text = anotherStudent.fullName

    }
}

data class Student(
    val fullName: String,
    val course: Int
) {
    override fun toString(): String {
        return fullName
    }
}