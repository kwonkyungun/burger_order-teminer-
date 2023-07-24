package com.example.menu


fun main (){
        println("========================Welcome=========================")
        println("[1] Burger Menu, [2] Side Menu, [3] Drink Menu, [4] 종료")

        var select = readLine()!!.toInt()
        if (select == 1){
                println("햄버거메뉴입니다.")
        }else if(select == 2){
                println("사이드메뉴입니다.")
                SideMenu().sidemenu()
        }else if (select == 3){
                println("음료메뉴입니다.")
        }else if (select == 4){
                println("종료합니다.")
        }
        else {
                println("잘못된 정보입니다.")
        }
}
