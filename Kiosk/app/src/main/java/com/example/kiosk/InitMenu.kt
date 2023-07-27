package com.example.kiosk



class InitMenu {

        fun mainMenu() {
            println("1번: [햄버거메뉴] 2번: [사이드메뉴] 3번: [음료메뉴] 4번: [종료]")
            var select = readLine()!!.toInt()
            if (select == 1) {
                println("햄버거메뉴입니다.")
            } else if (select == 2) {
                println("사이드메뉴입니다.")
            } else if (select == 3) {
                println("음료메뉴입니다.")
                classDrink().Beverage()
            } else if (select == 4) {
                println("종료합니다.")
            } else {
                println("잘못된 정보입니다.")
                 mainMenu()
            }
        }
}

