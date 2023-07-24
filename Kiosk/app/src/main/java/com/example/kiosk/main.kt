package com.example.kiosk

fun main() {
//    println("금액을 입력해 주세요 ")
//
//    var myMoney = ("money").toInt()

     initmenu()

}

fun initmenu() {

    println("1번: [햄버거메뉴] 2번: [사이드메뉴] 3번: [음료메뉴] 4번: [종료]")
    var select = readLine()!!.toInt()
    if (select == 1) {
        println("햄버거메뉴입니다.")
    } else if (select == 2) {
        println("사이드메뉴입니다.")
    } else if (select == 3) {
        println("음료메뉴입니다.")
        Beverage()
    } else if (select == 4) {
        println("종료합니다.")
    } else {
        println("잘못된 정보입니다.")
        initmenu()
    }
}


//class Drink {
    fun Beverage() {

        println("1번: [콜라] 2번: [사이다] 3번: [환타] 4번:[미란다] 5번:[뒤로가기]")
        var Drinkselect = readLine()!!.toInt()

        if (Drinkselect == 1) {
            println("콜라를 선택하였습니다.")
            val num1 = "콜라"

        } else if (Drinkselect == 2) {
            println("사이다를 선택하였습니다.")
            val num1 = "사이다"

        } else if (Drinkselect == 3) {
            println("환타를 선택하였습니다.")
            val num1 = "환타"

        } else if (Drinkselect == 4) {
            println("미란다를 선택하였습니다.")
            val num1 = "미란다"

        } else if (Drinkselect == 5) {
            println("뒤로가기")
            initmenu()
        } else {
            println("잘못선택하였습니다")
            Beverage()
        }

    }
//}

