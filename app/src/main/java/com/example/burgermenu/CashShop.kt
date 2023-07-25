package com.example.burgermenu


class CashShop private constructor() {
    private val ChickenPrice = 4500
    private val FriesPrice = 3000
    private val CheesePrice = 2000

    companion object {
        @Volatile
        private var instance: CashShop? = null
    }

    fun purchaseChicken(character: classperson) {
        if (character.money >= ChickenPrice) {
            println("[구매 후 금액]: [${character.money} - ${ChickenPrice}] = ${character.money - ChickenPrice}")
            character.money -= ChickenPrice
            character.shoppinglist.add("구매가 완료되었습니다.")
        } else {
            println("돈이 부족합니다.")
        }
    }

    fun purchaseFries(character: classperson) {
        if (character.money >= FriesPrice) {
            println("[구매 후 금액]: [${character.money} - ${FriesPrice}] = ${character.money - FriesPrice}")
            character.money -= FriesPrice
            character.shoppinglist.add("구매가 완료되었습니다.")
        } else {
            println("돈이 부족합니다.")
        }
    }

    fun purchaseCheese(character: classperson) {
        if (character.money >= CheesePrice) {
            println("[구매 후 금액]: [${character.money} - ${CheesePrice}] = ${character.money - CheesePrice}")
            character.money -= CheesePrice
            character.shoppinglist.add("구매가 완료되었습니다.")
        } else {
            println("돈이 부족합니다.")
        }
    }
}
