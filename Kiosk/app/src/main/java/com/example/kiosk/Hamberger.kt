package com.example.kiosk

class Hamburger(burgerList: ArrayList<Menu>) {
    val list = burgerList


    fun list() {
        list.forEach { menu ->
            when (menu) {
                is ShackBurger -> {
                    println(menu.name)
                    println(menu.price)
                    println(menu.event)
                }

                is CheeseBurger -> {
                    println(menu.name)
                    println(menu.price)
                }
            }
        }
    }

    fun hamburger() {


        println("1번 쉑버거, 2번 치즈버거, 3번 돌아가기")
        while (true) {
            try {
                var selectNumber = readLine()!!.toInt()


                when (selectNumber) {
                    1 -> {
                        println("쉑버거를 고르셨습니다.")
                    }

                    2 -> {
                        println("치즈버거")
                    }
                    3 -> {
                        println("돌아가기")
                        break
                    }
                }
            } catch (e: Exception) {
                println("잘못입력하셨습니다.")
            }
        }
    }
}