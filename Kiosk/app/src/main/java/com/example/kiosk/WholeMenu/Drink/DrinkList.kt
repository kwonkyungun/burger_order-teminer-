package com.example.kiosk.WholeMenu.Drink

import com.example.kiosk.initmenu


open class DrinkList {

        fun beverage() {

            println("[ Drink MENU ]")
            println("1. Cloa    | W 1000 | \n" +
                    "2. Sider   | W 800  | \n" +
                    "3. Fanta   | W 900  | \n" +
                    "4. Miranda | W 600  | \n" +
                    "0. 뒤로가기  | 뒤로가기  \n" )

            var Drinkselect = readLine()!!.toInt()
            var count1 = 1
            var count2 = 1
            var count3 = 1
            var count4 = 1
            if (Drinkselect == 1) {
                count1++
            } else if (Drinkselect == 2) {
                count2++
            } else if (Drinkselect == 3) {
                count3++
            } else if (Drinkselect == 4) {
                count4++
            } else if(Drinkselect == 0) {
                println("뒤로가기")
                class InitMenu()
            } else {
                println("잘못입력하였습니다.")
            }


            while (true) {
                println("[1] 콜라 추가 [2] 사이다 추가 [3] 환타 추가 [4] 미란다 추가 [5]뒤로가기")
                var selectNumber = readLine()!!.toInt()
                when (selectNumber) {
                    1 -> {
                        println("콜라를 ${count1}잔 추가합니다.")
                        count1++
                    }
                    2 -> {
                        println("사이다를 ${count2}잔 추가합니다.")
                        count2++
                    }
                    3 -> {
                        println("환타를 ${count3}잔 추가합니다.")
                        count3++
                    }
                    4 -> {
                        println("미란다를 ${count3}잔 추가합니다.")
                        count4++
                    }
                    else -> {
                        println("메인메뉴로 돌아갑니다.")
                        break
                    }
                }
            }
            class InitMenu()
    }
}