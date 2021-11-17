package com.petukhova.util

import android.text.format.DateFormat
import java.util.*

fun Date.toServerFormat(): String {
    return DateFormat.format("yyyy-MM-dd", Date()).toString()
}