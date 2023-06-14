package com.example.kotlin

fun main() {
    val result = test(3,c = 5)
    test2(name = "김재용",nickname ="재용","jy1114")
    println(result)
    println(time(1,2))

}

// 2. 함수
fun test(a:Int, b: Int  = 3, c: Int =4) : Int {
    println(a+b)
    return a+b
}

fun test2(name: String, nickname : String, id: String) =println(name + nickname + id)

fun time(a: Int, b: Int) = a*b


