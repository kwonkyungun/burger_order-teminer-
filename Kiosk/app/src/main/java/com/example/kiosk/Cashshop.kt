package com.example.kiosk

object Cashshop {
        val cola = 1000
        val cider = 800
        val Fanta = 700
        val Miranda = 500

    fun orderMenu(Character: Customer) {
        if (Character.money >= cola) {
            println("[구매 후 금액]: [${Character.money} - ${cola}] = ${Character.money - cola}")
            Character.money -= cola
            Character.shoppinglist.add("콜라")
        } else if (Character.money >= cider) {
            println("[구매 후 금액]: [${Character.money} - ${cider}] = ${Character.money - cider}")
            Character.money -= cider
            Character.shoppinglist.add("사이다")
        } else if (Character.money >= Fanta) {
            println("[구매 후 금액]: [${Character.money} - ${Fanta}] = ${Character.money - Fanta}")
            Character.money -= Fanta
            Character.shoppinglist.add("환타")
        } else if (Character.money >= Miranda) {
            println("[구매 후 금액]: [${Character.money} - ${Miranda}] = ${Character.money - Miranda}")
            Character.money -= Miranda
            Character.shoppinglist.add("미란다")
        } else {
            println("돈이 부족합니다.")
        }
    }

}

    fun openorderMenu(character: Customer) {
        println("구매전 : ${character.money}")
        Cashshop.orderMenu(character)
        println("구매후 : ${character.money}")
    }


