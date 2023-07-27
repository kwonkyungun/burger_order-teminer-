package com.example.kiosk

import java.util.function.BinaryOperator

fun main() {



    val menuSelect=InitMenu()
    val menuPrice = InitMenu()

    menuPrice.initPrice("money").toString().toInt()
    menuSelect.mainMenu()


}
//fun initmoney(type: String): Any? {
//    return when (type) {
//        "money" -> {
//            println("결제 가능한 금액을 입력해 주세요")
//            while (true) {
//                try {
//                    var Money: String? = readLine()
//                    return Money?.toInt()
//                } catch (e: Exception) {
//                    println("금액을 다시 입력해 주세요")
//                }
//            }
//        }
//
//        else -> {}
//    }
//}
//object CashShop  {
//    private val cola = 1000
//    private val cider = 800
//    private val Fanta = 700
//    private val Miranda = 500
//    fun colapurchase(Character: Classperson) {
//        if (Character.money >= cola) {
//            println("[구매 후 금액]: [${Character.money} - ${cola}] = ${Character.money - cola}")
//            Character.money -= cola
//            Character.shoppinglist.add("콜라")
//        } else if (Character.money >= cider) {
//            println("[구매 후 금액]: [${Character.money} - ${cider}] = ${Character.money - cider}")
//            Character.money -= cider
//            Character.shoppinglist.add("사이다")
//        } else if (Character.money >= Fanta) {
//            println("[구매 후 금액]: [${Character.money} - ${Fanta}] = ${Character.money - Fanta}")
//            Character.money -= Fanta
//            Character.shoppinglist.add("환타")
//        } else if (Character.money >= Miranda) {
//            println("[구매 후 금액]: [${Character.money} - ${Miranda}] = ${Character.money - Miranda}")
//            Character.money -= Miranda
//            Character.shoppinglist.add("미란다")
//        } else {
//            println("돈이 부족합니다.")
//        }
//    }
//}
//
//
//
//fun opencolapurchase(character: Classperson) {
//    println("구매전 : ${character.money}")
//    CashShop.colapurchase(character)
//    println("구매전 : ${character.money}")
//}