package com.example.menu

//interface
//class classperson (val money1: Int,val name1 :String): Character {
//    var name: String
//    var money: Int
//    var shoppinglist: MutableList<String>
//
//    constructor(_name: String, _money: Int):this(_money,_name) {
//        money = _money
//        name = _name
//        shoppinglist = mutableListOf<String>()
//        println("나의 이름은 ${name} 입니다.")
//        println("현재 금액은 ${money}원 있습니다.")
//        println("장바구니 목록은 ${shoppinglist} 입니다")
//    }
//}

class classperson(name: String, money: Int, shoppinglist: ArrayList<String>) {
    var name: String
    var money: Int
    var shoppinglist: ArrayList<String>

    init {

        this.name = name
        this.money = money
        this.shoppinglist = shoppinglist

        println("나의 이름은 ${name} 입니다.")
        println("현재 금액은 ${money}원 있습니다.")
        println("장바구니 목록은 ${shoppinglist} 입니다")
    }

}
