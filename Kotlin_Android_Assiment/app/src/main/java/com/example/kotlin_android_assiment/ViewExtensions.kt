package com.example.kotlin_android_assiment

import android.widget.TextView
import androidx.annotation.StringRes

/** Hiển thị một giá trị lên TextView và thay thế giá trị rỗng bằng nội dung mặc định. */
fun TextView.setStudentValue(value: String) {
    text = value.ifBlank { context.getString(R.string.value_not_available) }
}

/** Định dạng và hiển thị một trường thông tin sinh viên lên TextView. */
fun TextView.setStudentField(@StringRes formatRes: Int, value: String) {
    val displayValue = value.ifBlank { context.getString(R.string.value_not_available) }
    text = context.getString(formatRes, displayValue)
}
