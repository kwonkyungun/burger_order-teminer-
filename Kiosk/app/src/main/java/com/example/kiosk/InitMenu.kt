package com.example.kiosk

import com.example.kiosk.WholeMenu.Drink.DrinkList
import com.example.kiosk.WholeMenu.Side.SideList
import com.example.menu.BurgerList


class InitMenu {

        fun mainMenu() {
            println("1번: [햄버거메뉴] 2번: [사이드메뉴] 3번: [음료메뉴] 4번: [종료]")
            var select = readLine()!!.toInt()
            if (select == 1) {
                println("햄버거메뉴입니다.")
                BurgerList().burger()
            } else if (select == 2) {
                println("사이드메뉴입니다.")
                SideList().sidemenu()
            } else if (select == 3) {
                println("음료메뉴입니다.")
                DrinkList().beverage()
            } else if (select == 4) {
                println("종료합니다.")
                System.exit(0)
            } else {
                println("잘못된 정보입니다.")
                 mainMenu()
            }
        }
}

