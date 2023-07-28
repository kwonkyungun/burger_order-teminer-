package com.example.kiosk

sealed class Menu(
    open val name: String? = null,
    open val price: Int? = null,
    open val event: String? = null
)

data class ShackBurger(
    override val name: String?,
    override val price: Int?,
    override val event: String?
) : Menu()

data class CheeseBurger(
    override val name: String?,
    override val price: Int?
) : Menu()