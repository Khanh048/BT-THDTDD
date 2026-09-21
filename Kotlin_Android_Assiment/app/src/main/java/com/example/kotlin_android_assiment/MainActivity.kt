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

        findViewById<TextView>(R.id.tvStudentName).setStudentValue(svMe.hoTen)
        findViewById<TextView>(R.id.tvStudentID)
            .setStudentField(R.string.student_id_format, svMe.mssv)
        findViewById<TextView>(R.id.tvClass)
            .setStudentField(R.string.class_format, svMe.lop)
        findViewById<TextView>(R.id.tvMajor)
            .setStudentField(R.string.major_format, svMe.nganh)
        findViewById<TextView>(R.id.tvExtensionStatus)
            .setStudentValue(getString(R.string.extension_status))
    }
}
