package com.example.kiosk

import java.util.function.BinaryOperator

fun main() {
    val mainselect = InitMenu()
    mainselect.mainMenu()

}


//fun initmoney(type: String): Any? {
//    return when (type) {
//        "money" -> {
//            println("결제 가능한 금액을 입력해 주세요")
//            while (true) {
//                try {
//                    var Money: String? = readLine()
//                    return Money?.toInt()
//                } catch (e: Exception) {
//                    println("금액을 다시 입력해 주세요")
//                }
//            }
//        }
//
//        else -> {}
//    }
//}

//fun initmenu() {
//
//    println("1번: [햄버거메뉴] 2번: [사이드메뉴] 3번: [음료메뉴] 4번: [종료]")
//    var select = readLine()!!.toInt()
//    if (select == 1) {
//        println("햄버거메뉴입니다.")
//    } else if (select == 2) {
//        println("사이드메뉴입니다.")
//    } else if (select == 3) {
//        println("음료메뉴입니다.")
//        classDrink().Beverage()
//    } else if (select == 4) {
//        println("종료합니다.")
//
//    } else {
//        println("잘못된 정보입니다.")
//        initmenu()
//    }
//}
//
//class classDrink {
//    fun Beverage() {
//
//        println("1번: [콜라] 2번: [사이다] 3번: [환타] 4번:[미란다] 5번:[뒤로가기]")
//        var Drinkselect = readLine()!!.toInt()
//        var count1 = 1
//        var count2 = 1
//        var count3 = 1
//        var count4 = 1
//        if (Drinkselect == 1) {
//            count1++
//        } else if (Drinkselect == 2) {
//            count2++
//        } else if (Drinkselect == 3) {
//            count3++
//        } else if (Drinkselect == 4) {
//            count4++
//        } else if(Drinkselect == 5) {
//            initmenu()
//        } else {
//            println("잘못입력하였습니다.")
//        }
//
//
//        while (true) {
//            println("[1] 콜라 추가 [2] 사이다 추가 [3] 환타 추가 [4] 미란다 추가 [5]뒤로가기")
//            var selectNumber = readLine()!!.toInt()
//
//            when (selectNumber) {
//                1 -> {
//                    println("콜라를 ${count1}잔 추가합니다.")
//                    count1++
//                }
//
//                2 -> {
//                    println("사이다를 ${count2}잔 추가합니다.")
//                    count2++
//                }
//
//                3 -> {
//                    println("환타를 ${count3}잔 추가합니다.")
//                    count3++
//                }
//
//                4 -> {
//                    println("미란다를 ${count3}잔 추가합니다.")
//                    count4++
//                }
//
//                else -> {
//                    println("메인메뉴로 돌아갑니다.")
//                    break
//                }
//            }
//        }
//        initmenu()
//    }
//}
