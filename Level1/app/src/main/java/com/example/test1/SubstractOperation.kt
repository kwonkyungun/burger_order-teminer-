package test

class SubstractOperation(_num1: Int, _num2: Int) {
    var num1 = _num1
    var num2 = _num2

    fun subresult() {
        var result = num1 - num2
        println("${num1} 빼기 ${num2} 결과는 ${result} 입니다 ")
    }
}