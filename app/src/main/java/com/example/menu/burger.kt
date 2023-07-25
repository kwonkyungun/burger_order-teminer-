package com.example.menu

import com.example.kiosk.initmenu

//class Burger {

class Hamburger {
    fun burger() {
        println("[ Burgers MENU ]")
        println("1. ShackBurger   | W 6900 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
        println("2. SmokeShack    | W 8900 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
        println("3. ShroomBurger  | W 9400 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
        println("4. Cheeseburger  | W 6900 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
        println("5. BasicBurger   | W 5400 | 비프패티를 기반으로 야채가 들어간 기본버거")
        println("0. 뒤로가기       | 뒤로가기")

        var Burgerselect = readLine()!!.toInt()
        var count1 = 1
        var count2 = 1
        var count3 = 1
        var count4 = 1
        var count5 = 1
        if (Burgerselect == 1) {
            println("ShackBurger를 고르셨습니다")
            println("ShackBurger | W 6900 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
            Ingredients()
            count1++
        } else if (Burgerselect == 2) {
            println("SmokeShack를 고르셨습니다")
            println("SmokeShack | W 8900 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
            //Shoppinglist()
            Ingredients()
            count2++
        } else if (Burgerselect == 3) {
            println("ShroomBurger를 고르셨습니다")
            println("ShroomBurger | W 9400 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
            Ingredients()
            count3++
        } else if (Burgerselect == 4) {
            println("CheeseBurger를 고르셨습니다")
            println("Cheeseburger | W 6900 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
            Ingredients()
            count4++
        } else if (Burgerselect == 5) {
            println("BasicBurger를 고르셨습니다")
            println("BasicBurger | W 5400 | 비프패티를 기반으로 야채가 들어간 기본버거")
            Ingredients()
            count5++
        } else if (Burgerselect == 0) {
            println("돌아가기")
            initmenu()
        }
    }


    fun Ingredients() {
        println("[ Add Ingredients ]")
        println("1. Patty        | W 1500 | 패티 한 장 추가하기")
        println("2. Lettuce      | W 1000 | 양상추 추가하기")
        println("3. ShakeSource  | W 1000 | 쉑소스 추가하기")
        println("4. 추가안함      | 뒤로가기")

        var count1 = 1
        var count2 = 1
        var count3 = 1

        while (true) {
            println("[1] 패티 추가, [2] 양상추 추가, [3] 쉑소스 추가 4.[추가안함]")
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
                    println("쉑소스를 ${count3}번 추가합니다.")
                    count3++

                }

                else -> {
                    println("뒤로가기")
                    break
                }
            }
        }
        initmenu()
    }
}

