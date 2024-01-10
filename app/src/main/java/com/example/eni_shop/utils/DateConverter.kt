package com.example.eni_shop.utils

import java.text.SimpleDateFormat
import java.util.Date

object DateConverter {

    @JvmStatic
    fun dateToSimpleString(date: Date): String {
        val format = SimpleDateFormat("dd/MM/yyyy")
        return format.format(date)
    }


}