package com.example.kiosk

import java.util.function.BinaryOperator

fun main() {

    val menuSelect=InitMenu()
    val menuPrice = InitMenu()

    menuPrice.initPrice("money").toString().toInt()
    menuSelect.mainMenu()


}
