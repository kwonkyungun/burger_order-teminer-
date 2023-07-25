package com.example.menu

//class Burger {

fun main() {
    println("1번: [ShackBurger] 2번: [SmokeShack] 3번: [ShroomBurger] 4번: [CheeseBurger] 5번: [Hamburger] 0번: [돌아가기]")

    var Burgerselect = readLine()!!.toInt()

    if (Burgerselect == 1) {
        println("ShackBurger를 고르셨습니다")
        aaa().Ingredients()
    } else if (Burgerselect == 2) {
        println("SmokeShack를 고르셨습니다")
        bbb().Ingredients()
    } else if (Burgerselect == 3) {
        println("ShroomBurger를 고르셨습니다")
        ccc().Ingredients()
    } else if (Burgerselect == 4) {
        println("CheeseBurger를 고르셨습니다")
        ddd().Ingredients()
    } else if (Burgerselect == 5) {
        println("Hamburger를 고르셨습니다")
        fff().Ingredients()
    } else if (Burgerselect == 0) {
        println("돌아가기")
        initmenu()
    }
}

class aaa {
    fun Ingredients() {
        var count1 = 0
        var count2 = 0
        var count3 = 0

        while (true) {
            println("[1] 패티추가, [2] 양상추 추가, [3] 소스추가 4.[종료]")
            var selectNumber = readLine()!!.toInt()

            when (selectNumber) {
                1 -> {
                    println("패티를 추가합니다.")
                    count1++
                    println("${count1}")
                }

                2 -> {
                    println("양상추를 추가합니다.")
                    count2++
                    println("${count2}")
                }

                3 -> {
                    println("소스를 추가합니다.")
                    count3++
                    println("${count3}")
                }

                else -> {
                    println("종료.")
                    break
                }
            }
        }
    }
}

class bbb {
    fun Ingredients() {
        var count1 = 0
        var count2 = 0
        var count3 = 0

        while (true) {
            println("[1] 패티추가, [2] 양상추 추가, [3] 소스추가 4.[종료]")
            var selectNumber = readLine()!!.toInt()

            when (selectNumber) {
                1 -> {
                    println("패티를 추가합니다.")
                    count1++
                    println("${count1}")
                }

                2 -> {
                    println("양상추를 추가합니다.")
                    count2++
                    println("${count2}")
                }

                3 -> {
                    println("소스를 추가합니다.")
                    count3++
                    println("${count3}")
                }

                else -> {
                    println("종료.")
                    break
                }
            }
        }
    }
}

class ccc {
    fun Ingredients() {
        var count1 = 0
        var count2 = 0
        var count3 = 0

        while (true) {
            println("[1] 패티추가, [2] 양상추 추가, [3] 소스추가 4.[종료]")
            var selectNumber = readLine()!!.toInt()

            when (selectNumber) {
                1 -> {
                    println("패티를 추가합니다.")
                    count1++
                    println("${count1}")
                }

                2 -> {
                    println("양상추를 추가합니다.")
                    count2++
                    println("${count2}")
                }

                3 -> {
                    println("소스를 추가합니다.")
                    count3++
                    println("${count3}")
                }

                else -> {
                    println("종료.")
                    break
                }
            }
        }
    }
}

class ddd {
    fun Ingredients() {
        var count1 = 0
        var count2 = 0
        var count3 = 0

        while (true) {
            println("[1] 패티추가, [2] 양상추 추가, [3] 소스추가 4.[종료]")
            var selectNumber = readLine()!!.toInt()

            when (selectNumber) {
                1 -> {
                    println("패티를 추가합니다.")
                    count1++
                    println("${count1}")
                }

                2 -> {
                    println("양상추를 추가합니다.")
                    count2++
                    println("${count2}")
                }

                3 -> {
                    println("소스를 추가합니다.")
                    count3++
                    println("${count3}")
                }

                else -> {
                    println("종료.")
                    break
                }
            }
        }
    }
}

class fff {
    fun Ingredients() {
        var count1 = 0
        var count2 = 0
        var count3 = 0

        while (true) {
            println("[1] 패티추가, [2] 양상추 추가, [3] 소스추가 4.[종료]")
            var selectNumber = readLine()!!.toInt()

            when (selectNumber) {
                1 -> {
                    println("패티를 추가합니다.")
                    count1++
                    println("${count1}")
                }

                2 -> {
                    println("양상추를 추가합니다.")
                    count2++
                    println("${count2}")
                }

                3 -> {
                    println("소스를 추가합니다.")
                    count3++
                    println("${count3}")
                }

                else -> {
                    println("종료.")
                    break
                }
            }
        }
    }
}
//    fun addIngredient() {
//        println(
//            "재료를 추가하실수 있습니다" +
//                    "1번 [패티] 2번 [양상추] 3번 [토마토] 4번 [소스] 5번 [추가안함]"
//        )
//
//        var Addingredient = readLine()!!.toInt()
//
//        if (Addingredient == 1) {
//            println("")
//        }
//    }
//}
