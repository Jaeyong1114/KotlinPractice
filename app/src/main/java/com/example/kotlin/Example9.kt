package com.example.kotlin

fun main(){
    val a = 10
    val name = "안녕"
    val isHigh = true

    println(a.toString() + name + isHigh.toString()) //자바로 할때 로그로 값확인하는법

    println("$a $name $isHigh") // 달러 표시만 하면 변수값 그대로보임
    println("$a ${name.length} $isHigh") // 메서드에 대한 결과값도 가능
}