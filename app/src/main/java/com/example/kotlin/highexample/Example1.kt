package com.example.kotlin.highexample

fun main() {
    //람다
    // 1. 익명함수(함수의 이름이 없다)
    // 2. 하나의 변수처럼 사용될 수 있다. ( 어떤 함수의 argument , return 값으로 들어갈 수 있다)
    // 3. 한 번 사용되고, 재사용되지 않는 험수
    val a =fun(){ println("hello")}
    val b : (Int) -> Int = {
        it * 10 }
    val c = { i : Int , j : Int -> i * j}
    val d : (Int, String, Boolean ) -> String = { a, b, c -> b} // a랑 c 처럼 사용안하면 _ 로 생략가능  { _,b,_ -> b}

    println(b(10))
    println(c(3,5))


    hello(10,b)
}

fun hello(a: Int, b: (Int) -> Int) : (Int) -> Int{
    println(a)
    println(b(20))
    return b
}