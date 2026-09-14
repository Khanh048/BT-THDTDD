package com.example.kotlin_android_assiment

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val svMe = SinhVien(
            hoTen = "Võ Quốc Khánh",
            mssv = "2415053122121",
            lop = "24T1",
            nganh = "Công nghệ thông tin"
        )

        val tvStudentName = findViewById<TextView>(R.id.tvStudentName)
        val tvStudentID = findViewById<TextView>(R.id.tvStudentID)
        val tvClass = findViewById<TextView>(R.id.tvClass)
        val tvMajor = findViewById<TextView>(R.id.tvMajor)

        tvStudentName.text = "Họ và tên: ${svMe.hoTen}"
        tvStudentID.text = "MSSV: ${svMe.mssv}"
        tvClass.text = "Lớp: ${svMe.lop}"
        tvMajor.text = "Ngành: ${svMe.nganh}"
    }
}