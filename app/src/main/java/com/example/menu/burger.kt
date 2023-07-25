package com.example.menu

//class Burger {

class Hamburger {
    fun burger() {
        println("[ Burgers MENU ]")
        println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
        println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
        println("3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
        println("4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
        println("5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거")
        println("0. 뒤로가기       | 뒤로가기")

        var Burgerselect = readLine()!!.toInt()

        if (Burgerselect == 1) {
            println("ShackBurger를 고르셨습니다")
            Ingredients()
        } else if (Burgerselect == 2) {
            println("SmokeShack를 고르셨습니다")
            Ingredients()
        } else if (Burgerselect == 3) {
            println("ShroomBurger를 고르셨습니다")
            Ingredients()
        } else if (Burgerselect == 4) {
            println("CheeseBurger를 고르셨습니다")
            Ingredients()
        } else if (Burgerselect == 5) {
            println("Hamburger를 고르셨습니다")
            Ingredients()
        } else if (Burgerselect == 0) {
            println("돌아가기")
            initmenu()
        }
    }


    fun Ingredients() {
        var count1 = 1
        var count2 = 1
        var count3 = 1

        while (true) {
            println("[1] 패티추가, [2] 양상추 추가, [3] 소스추가 4.[종료]")
            var selectNumber = readLine()!!.toInt()

            when (selectNumber) {
                1 -> {
                    println("패티를 ${count1}번 추가합니다.")
                    count1++

                }

                2 -> {
                    println("양상추를 ${count2}번 추가합니다.")
                    count2++

                }

                3 -> {
                    println("소스를 ${count3}번 추가합니다.")
                    count3++

                }

                else -> {
                    println("종료.")
                    break
                }
            }
        }
    }
}

