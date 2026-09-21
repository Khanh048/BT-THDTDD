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

        findViewById<TextView>(R.id.tvStudentName).text = svMe.hoTen
        findViewById<TextView>(R.id.tvStudentID).text =
            getString(R.string.student_id_format, svMe.mssv)
        findViewById<TextView>(R.id.tvClass).text =
            getString(R.string.class_format, svMe.lop)
        findViewById<TextView>(R.id.tvMajor).text =
            getString(R.string.major_format, svMe.nganh)
    }
}
