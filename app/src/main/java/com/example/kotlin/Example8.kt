package com.example.kotlin

fun main() {
    println(check("안녕"))
    println(check(3))
    println(check(true))

    cast("안녕")
    cast(10)
    println("/")
    println(smartcast("안녕"))
    println(smartcast(10))
    println(smartcast(true))
}

/*fun check(a: Any): String{   // 코틀린에서는 타입 체크를 할때 is를 씀  when 문 으로 가능
    return if(a is String){
        "문자열"
     } else if (a is Int){
         "숫자"
    } else {
        "몰라요"
    }*/

fun check(a: Any): String{
    return when (a) {
        is String -> {
            "문자열"
        }
        is Int -> {
            "숫자"
        }
        else -> {
            "몰라요"
        }
    }



}

fun cast(a : Any) {
    /*val result = a as? String*/ //String 으로 변환이 될 수 없을때 null 로 만들어줌
    val result = (a as? String) ?: "실패" //엘비스 오퍼레이트 를 붙이면 캐스팅이 안될시 (null) 일 시 실패
    println(result)
}

fun smartcast(a : Any) : Int{
    return if (a is String){
        a.length
    } else if ( a is Int){
        a.dec()
    } else {
        -1
    }
}