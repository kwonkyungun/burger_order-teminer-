package com.example.menu

class SideMenu {
    fun sidemenu() {
        println("=================================[Side Menu]=============================================")
        println("1. SHAKE SHAKE CHICKEN | 시즈닝(오니언, 치즈, 칠리) 한 가지를 선택해 뿌려먹는 치킨 디저트 - 10조각")
        println("2. SHAKE SHAKE FRIES   | 시즈닝(오니언, 치즈, 칠리) 한 가지를 선택해 뿌려먹는 포테이토")
        println("3. CHEESE STICK        | 통모짜렐라치즈에 튀김옷을 입혀 만든 바삭하고 고소한 대표 디저트 메뉴")
        println("4. 종료                 | 프로그램 종료")
        var sideselect = readLine()!!.toInt()
        if (sideselect == 1) {
            println("SHAKE SHAKE CHICKEN을 선택하셨습니다.")
            println("  원하는 맛의 시즈닝을 선택하세요.")
            println("[1] ONION, [2] CHEESE, [3] CHILLI")
            var sidesel = readLine()!!.toInt()
            if (sidesel == 1) {
                println("ONION을 선택하셨습니다.")
                println("ONION 시즈닝과 함께 SHAKE SHAKE CHICKEN을 준비해 드리겠습니다.")
            } else if (sidesel == 2) {
                println("CHEESE를 선택하셨습니다.")
                println("CHEESE 시즈닝과 함께 SHAKE SHAKE CHICKEN을 준비해 드리겠습니다.")
            } else if (sidesel == 3) {
                println("CHILLI를 선택하셨습니다.")
                println("CHILLI 시즈닝과 함께 SHAKE SHAKE CHICKEN을 준비해 드리겠습니다.")
            } else println("번호를 다시 입력해 주세요.")
        } else if (sideselect == 2) {
            println(
                "SHAKE SHAKE FRIES를 선택하셨습니다." +
                        "  원하는 맛의 시즈닝을 선택하세요." +
                        "[1] ONION, [2] CHEESE, [3] CHILLI"
            )
            var sidesel2 = readLine()!!.toInt()
            if (sidesel2 == 1) {
                println("ONION을 선택하셨습니다.")
                println("ONION 시즈닝과 함께 SHAKE SHAKE FRIES를 준비해 드리겠습니다.")
            } else if (sidesel2 == 2) {
                println("CHEESE를 선택하셨습니다.")
                println("CHEESE 시즈닝과 함께 SHAKE SHAKE FRIES를 준비해 드리겠습니다.")
            } else if (sidesel2 == 3) {
                println("CHILLI를 선택하셨습니다.")
                println("CHILLI 시즈닝과 함께 SHAKE SHAKE FRIES를 준비해 드리겠습니다.")
            } else println("번호를 다시 입력해 주세요.")
        } else if (sideselect == 3) {
            println("  CHEESE STICK을 선택하셨습니다.")
            println("바삭한 치즈스틱을 준비해 드리겠습니다.")
        } else if (sideselect == 4) {
            println("종료하기를 선택하셨습니다.")
            println("프로그램을 종료하겠습니다.")
        } else {
            println("번호를 다시 입력해 주세요.")
        }
    }
}






