package com.example.kiosk

import com.example.menu.Hamburger
import java.util.function.BinaryOperator

fun main() {
    val myMoney = initmoney("money").toString().toInt()
    initmoney(type = String.toString())

    initmenu()

}


fun initmoney(type: String): Any? {
    return when (type) {
        "money" -> {
            println("결제 가능한 금액을 입력해 주세요")
            while (true) {
                try {
                    var Money: String? = readLine()
                    return Money?.toInt()
                } catch (e: Exception) {
                    println("금액을 다시 입력해 주세요")
                }
            }
        }

        else -> {}
    }
}

fun initmenu() {
    println("========================Welcome=========================")
    println("[1] Burger Menu, [2] Side Menu, [3] Drink Menu, [4] 종료")

    var select = readLine()!!.toInt()
    if (select == 1) {
        println("햄버거메뉴입니다.")
        Hamburger().burger()
    } else if (select == 2) {
        println("사이드메뉴입니다.")
        //Sidemenu().sidemenu()
    } else if (select == 3) {
        println("음료메뉴입니다.")
            //classDrink().Beverage()
    } else if (select == 4) {
        println("종료합니다.")

    } else {
        println("잘못된 정보입니다.")
        initmenu()
    }
}

