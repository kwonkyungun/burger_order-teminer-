package com.example.kiosk

fun main() {
    println("메인메뉴 입니다.")
    println("1. 햄버거, 2. 종료")

    var burgerList = ArrayList<Menu>()
    burgerList.add(
        ShackBurger(
            name = "ShackBurger",
            price = 6900,
            event = "1번입니다"
        )
    )
    burgerList.add(
        CheeseBurger(
            name = "CheeseBurger 입니다",
            price = 5000
        )
    )


    while (true) {
        try {
            var selectNumber = readLine()!!.toInt()


            when (selectNumber) {

                1 -> {
                    println("햄버거를 고르셨습니다.")
                    Hamburger(burgerList).list()
                    Hamburger(burgerList).hamburger()
                }

                2 -> {
                    println("종료합니다.")
                    System.exit(0)
                }
            }
        } catch (e: Exception) {
            println("잘못입력하셨습니다.")
        }
    }
}