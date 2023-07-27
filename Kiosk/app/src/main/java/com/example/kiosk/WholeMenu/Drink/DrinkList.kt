package com.example.kiosk.WholeMenu.Drink

import com.example.kiosk.initmenu

open class DrinkList {

        fun Beverage() {

            println("1번: [콜라] 2번: [사이다] 3번: [환타] 4번:[미란다] 5번:[뒤로가기]")
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
            } else if(Drinkselect == 5) {
                initmenu()
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
            initmenu()
    }
}