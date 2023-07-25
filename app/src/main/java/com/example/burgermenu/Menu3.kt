package com.example.burgermenu

import java.lang.Exception

fun main () {

    println("[1] Burger Menu, [2] Side Menu, [3] Drink Menu, [4] 종료")

    var select = readLine()!!.toInt()
    if (select == 1) {
        println("햄버거메뉴입니다.")
    } else if (select == 2) {
        println("사이드메뉴입니다.")
        SideMenu().sidemenu()
    } else if (select == 3) {
        println("음료메뉴입니다.")
    } else if (select == 4) {
        println("종료합니다.")
    } else {
        println("잘못된 번호입니다.")
        println("다시 입력해주세요.")
        main()
    }
}


//    val myMoney = initmoney("money").toString().toInt()
//    initmoney(type = String.toString())
//    main()
//}

//fun initmoney(type:String): Any? {
//    return when (type) {
//        "money" -> {
//            println("==========Welcome===========")
//            println("결제 가능한 금액을 입력해 주세요.")
//            while (true) {
//                try {
//                    var order: String? = readLine()
//                    return order?.toInt()
//                } catch (e: Exception) {
//                    println("금액을 다시 입력해주세요.")
//                }
//            }
//
//        }
//
//        else -> {
//            println("금액을 다시 입력해주세요.")
//        }
//    }

//    fun initmenu() {

