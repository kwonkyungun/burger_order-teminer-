package test

fun main() {
    println("수행할 연산식을 입력해주세요.")
    println("[1번 : 더하기] [2번 : 빼기] [3번 : 곱하기] [4번 : 나누기] [5번 : 나머지].")
    var operator = readLine()!!.toInt()
    println("첫번째 숫자를 입력해주세요.")
    var num1 = readLine()!!.toInt()
    println("두번째 숫자를 입력해주세요")
    var num2 = readLine()!!.toInt()

    if(operator == 1) {
        println("더하기 연산자입니다..")
        AddOperation (num1, num2).addresult()
    } else if(operator == 2) {
        println("빼기 연산자입니다..")
        SubstractOperation (num1, num2).subresult()
    } else if(operator == 3) {
        println("곱하기 연산자입니다..")
        MultiplyOperation (num1, num2).multiplyresult()
    } else if(operator == 4) {
        println("나누기 연산자입니다..")
        DivideOperation (num1, num2).Divideresult()
    } else if (operator == 5){
        println("나머지 연산자입니다..")
        Calculator (num1, num2).remainresult()
    }
    else {
        println("잘못된 연산자입니다.")
    }
}
class Calculator (_num1: Int, _num2: Int) {
    var num1 = _num1
    var num2 = _num2

//    fun addresult() {
//        var result = num1 + num2
//        println("${num1} 더하기 ${num2} 결과는 ${result} 입니다 ")
//    }
//    fun subresult() {
//        var result = num1 - num2
//        println("${num1} 빼기 ${num2} 결과는 ${result} 입니다 ")
//    }
//    fun multiplyresult() {
//        var result = num1 * num2
//        println("${num1} 곱하기 ${num2} 결과는 ${result} 입니다 ")
//    }
//    fun Divideresult() {
//        var result = num1 / num2
//        println("${num1} 나누기 ${num2} 결과는 ${result} 입니다 ")
//    }
    fun remainresult() {
        var result = num1 % num2
        println("${num1} 나머지 ${num2} 결과는 ${result} 입니다 ")
    }
}


