package com.example.kotlin

fun main() {
    var name : String? = "재용" // 이값에 는 널이 들어갈수 없음 이 이문장에 포함이 되어있음.
    var number : Int = 10 //마찬가지로 number 에도 null 이 들어갈 수 없음


    // null 을 넣고싶으면
    var nickname: String? = null // 어떤 타입에 ? 을 붙이면 해당 타입이 Null 가능
    var secondNumber : Int? = null

   /* val result = if(nickname == null){
        "값이 없음"
    } else {
        nickname
    }*/


    val result = nickname?: "값이 없음" // nickname이 null 이면 오른쪽 값 null 이아니면 nickname 즉 위 주석이랑 같음

    val size = nickname?.length // nickname 이 Null 이면 더이상 실행 하지않음 , Null 이아니면 length 내뱉음
    println(size)

    println(result)
}