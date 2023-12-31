package com.example.kiosk.WholeMenu.Side

import com.example.kiosk.InitMenu

class SideList {
    fun sidemenu() {
        println("[ Burgers MENU ]")
        println("1. Chicken Tenders  | W 4500 | 100% 국내산 닭다리 통살로 튀겨진 치킨텐더")
        println("2. French Fries     | W 3000 | 인기만점 바삭한 프렌치 프라이")
        println("3. Cheese Stick     | W 2000 | 통모짜렐라치즈에 튀김옷을 입혀 만든 바삭하고 고소한 대표 디저트 메뉴")
        println("0. 뒤로가기           | 뒤로가기")

        var sideselect = readLine()!!.toInt()
        var count1 = 1
        var count2 = 1
        var count3 = 1

        if (sideselect == 1) {
            println("Chicken Tenders를 고르셨습니다")
            println("Chicken Tenders  | W 4500 | 100% 국내산 닭다리 통살로 튀겨진 치킨텐더")
            add()
            count1++
        } else if (sideselect == 2) {
            println("French Fries를 고르셨습니다")
            println("French Fries     | W 3000 | 인기만점 바삭한 프렌치 프라이")
            add()
            count2++
        } else if (sideselect == 3) {
            println("Cheese Stick을 고르셨습니다")
            println("Cheese Stick     | W 2000 | 통모짜렐라치즈에 튀김옷을 입혀 만든 바삭하고 고소한 대표 디저트 메뉴")
            add()
            count3++
        } else if (sideselect == 0) {
            println("뒤로가기")
            InitMenu().mainMenu()
        } else {
            println("잘못입력하였습니다.")
            sidemenu()
        }
    }

    fun add() {
        println("[ Add Side Option ]")
        println("1. Chicken Tenders  | W 4500 | 치킨텐더 추가하기")
        println("2. French Fries     | W 3000 | 프렌치 프라이 추가하기")
        println("3. Cheese Stick     | W 2000 | 치즈스틱 추가하기")
        println("0. 추가안함           | 뒤로가기")

        var count1 = 1
        var count2 = 1
        var count3 = 1


        while (true) {
            var selectNumber = readLine()!!.toInt()

            when (selectNumber) {
                1 -> {
                    println("치킨텐더를 ${count1}개 | W 4500 | 추가합니다.")
                    count1++

                }

                2 -> {
                    println("프렌치 프라이를 ${count2}개 | W 3000 | 추가합니다.")
                    count2++

                }

                3 -> {
                    println("치즈스틱을 ${count3}개 | W 2000 | 추가합니다.")
                    count3++

                }

                0 -> {
                    println("뒤로가기")
                    break
                }

                else -> {
                    println("잘못입력하였습니다.")
                    add()
                }
            }
        }
        InitMenu().mainMenu()
    }
}






