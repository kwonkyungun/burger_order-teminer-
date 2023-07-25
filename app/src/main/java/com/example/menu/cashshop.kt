package com.example.menu

class CashShop private constructor() {
    private val ShackBurgerPrice = 6900
    private val SmokeBurgerPrice = 8900
    private val ShroomBurgerPrice = 9400
    private val CheeseBurgerPrice = 6900
    private val BasicBurgerPrice = 5400

    companion object {
        @Volatile
        private var instance: CashShop? = null

        fun getInstance(): CashShop {
            if (instance == null) {
                synchronized(this) {
                    instance = CashShop()
                }
            }
            return instance!!
        }
    }

    fun purchaseShackBurgerByclassperson(character: classperson) {
        if (character.money >= ShackBurgerPrice) {
            println("[구매 후 금액]: [${character.money} - ${ShackBurgerPrice}] = ${character.money - ShackBurgerPrice}")
            character.money -= ShackBurgerPrice
            character.shoppinglist.add("ShackBurger를 구매합니다")
        } else {
            println("돈이 부족합니다.")
        }
    }

    fun purchaseSmokeBurgerPriceByclassperson(character: classperson) {
        if (character.money >= SmokeBurgerPrice) {
            println("[구매 후 금액]: [${character.money} - ${SmokeBurgerPrice}] = ${character.money - SmokeBurgerPrice}")
            character.money -= SmokeBurgerPrice
            character.shoppinglist.add("SmokeBurger를 구매합니다")
        } else {
            println("돈이 부족합니다.")
        }
    }

    fun purchaseShroomBurgerPriceByclassperson(character: classperson) {
        if (character.money >= ShroomBurgerPrice) {
            println("[구매 후 금액]: [${character.money} - ${ShroomBurgerPrice}] = ${character.money - ShroomBurgerPrice}")
            character.money -= ShroomBurgerPrice
            character.shoppinglist.add("ShroomBurger를 구매합니다")
        } else {
            println("돈이 부족합니다.")
        }
    }

    fun purchaseCheeseBurgerPriceByclassperson(character: classperson) {
        if (character.money >= CheeseBurgerPrice) {
            println("[구매 후 금액]: [${character.money} - ${CheeseBurgerPrice}] = ${character.money - CheeseBurgerPrice}")
            character.money -= CheeseBurgerPrice
            character.shoppinglist.add("CheeseBurger를 구매합니다")
        } else {
            println("돈이 부족합니다.")
        }
    }

    fun purchaseBasicBurgerPriceByclassperson(character: classperson) {
        if (character.money >= BasicBurgerPrice) {
            println("[구매 후 금액]: [${character.money} - ${BasicBurgerPrice}] = ${character.money - BasicBurgerPrice}")
            character.money -= BasicBurgerPrice
            character.shoppinglist.add("BasicBurger를 구매합니다")
        } else {
            println("돈이 부족합니다.")

        }
    }
}