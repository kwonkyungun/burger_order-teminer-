package com.example.kiosk

class Customer(_money: Int) {
        var money: Int = _money
        var shoppinglist: MutableList<String>

        init {
            shoppinglist = mutableListOf<String>()
            println("현재 금액은 ${money}원 있습니다.")
            println("장바구니 목록은 ${shoppinglist} 있습니다.")
        }
}