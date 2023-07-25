package com.example.burgermenu

//SideMenu
class SideMenu {

    fun sidemenu() {
        println("===================================[Side Menu]===============================================")
        println("1. CHICKEN TENDERS     | W 4.5 | 100% 국내산 닭다리 통살로 튀겨진 치킨텐더")
        println("2. FRENCH FRIES        | W 3.0 | 인기만점 바삭한 프렌치 프라이")
        println("3. CHEESE STICK        | W 2.0 | 통모짜렐라치즈에 튀김옷을 입혀 만든 바삭하고 고소한 대표 디저트 메뉴")
        println("4. 뒤로가기")
        var sideselect = readLine()!!.toInt()
        var count1 = 1
        var count2 = 1
        var count3 = 1
        if (sideselect == 1) {
            count1++
        } else if (sideselect == 2) {
            count2++
        } else if (sideselect == 3) {
            count3++
        } else if (sideselect == 4) {
            main()
        } else {
            println("잘못입력하였습니다.")
            sidemenu()
        }
        while (true) {
            println("========================[추가하실 사이드메뉴를 선택해주세요.]=======================================")
            println("1. CHICKEN TENDERS     | W 4.5 | 추가")
            println("2. FRENCH FRIES        | W 3.0 | 추가")
            println("3. CHEESE STICK        | W 2.0 | 추가")
            println("4. 뒤로가기")
            var selectCount = readLine()!!.toInt()
            when (selectCount) {
                1 -> {
                    println("CHICKEN TENDERS ${count1}개 추가합니다.")
                    count1++
                }

                2 -> {
                    println("FRENCH FRIES ${count2}개 추가합니다.")
                    count2++
                }

                3 -> {
                    println("CHEESE STICK ${count3}개 추가합니다.")
                    count3++
                }
                4 -> {
                    println("     뒤로가기")
                    println("메인메뉴로 돌아갑니다.")
                    main()
                }

                else -> {
                    println("잘못입력하였습니다.")
                }
            }
        }


    }
}
//    var money:Int
//    constructor(_money:Int) {
//        money = _money
//    }

//    fun sidemenu() {
//        var sideselect = readLine()!!.toInt()
//        if (sideselect == 1) {
//            println("SHAKE SHAKE CHICKEN을 선택하셨습니다.")
//            println("  원하는 맛의 시즈닝을 선택하세요.")
//            println("[1] ONION, [2] CHEESE, [3] CHILLI, [4] 뒤로가기")
//            var sidesel = readLine()!!.toInt()
//            if (sidesel == 1) {
//                println("ONION을 선택하셨습니다.")
//                println("ONION 시즈닝과 함께 SHAKE SHAKE CHICKEN을 준비해 드리겠습니다.")
//            } else if (sidesel == 2) {
//                println("CHEESE를 선택하셨습니다.")
//                println("CHEESE 시즈닝과 함께 SHAKE SHAKE CHICKEN을 준비해 드리겠습니다.")
//            } else if (sidesel == 3) {
//                println("CHILLI를 선택하셨습니다.")
//                println("CHILLI 시즈닝과 함께 SHAKE SHAKE CHICKEN을 준비해 드리겠습니다.")
//            } else if (sidesel == 4) {
//                println("뒤로가기를 선택하셨습니다.")
//                sidemenu()
//            } else println("번호를 다시 입력해 주세요.")
//        } else if (sideselect == 2) {
//            println("SHAKE SHAKE FRIES를 선택하셨습니다.")
//            println("  원하는 맛의 시즈닝을 선택하세요.")
//            println(
//                "[1] ONION, [2] CHEESE, [3] CHILLI, [4] 뒤로가기"
//            )
//            var sidesel2 = readLine()!!.toInt()
//            if (sidesel2 == 1) {
//                println("ONION을 선택하셨습니다.")
//                println("ONION 시즈닝과 함께 SHAKE SHAKE FRIES를 준비해 드리겠습니다.")
//            } else if (sidesel2 == 2) {
//                println("CHEESE를 선택하셨습니다.")
//                println("CHEESE 시즈닝과 함께 SHAKE SHAKE FRIES를 준비해 드리겠습니다.")
//            } else if (sidesel2 == 3) {
//                println("CHILLI를 선택하셨습니다.")
//                println("CHILLI 시즈닝과 함께 SHAKE SHAKE FRIES를 준비해 드리겠습니다.")
//            } else if (sidesel2 == 4) {
//                println("뒤로가기를 선택하셨습니다.")
//                sidemenu()
//            } else println("번호를 다시 입력해 주세요.")
//        } else if (sideselect == 3) {
//            println("  CHEESE STICK을 선택하셨습니다.")
//            println("바삭한 치즈스틱을 준비해 드리겠습니다.")
//        } else if (sideselect == 4) {
//            println("뒤로가기를 선택하셨습니다.")
//            initmenu()
//        } else {
//            println("번호를 다시 입력해 주세요.")
//            initmenu()
//        }
//    }
//}