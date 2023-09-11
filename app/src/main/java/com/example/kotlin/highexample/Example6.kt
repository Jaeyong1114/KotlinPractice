package com.example.kotlin.highexample

/* Object, Companion object
 Object : 클래스를 정의함과 동시에 객체를 생성
  싱글톤을 쉽게 만들 수 있는 키워드.
  생성자 사용불가.
  에러코드를 정의할 때 많이 사용

  Companion Object 동반객체
  Java의 static 과 동일한 역할
  클래스 내에서 하나만 생성 가능
 */

fun main() {

    println(Counter.count)
    Counter.countUp()
    Counter.countUp()
    println(Counter.count)
    Counter.hello()

}

object Counter : Hello(){
    init {
        println("카운터 초기화")
    }
    var count = 0
    fun countUp() {
        count++
    }

}

open class Hello() {
    fun hello() = println("하이")

}


class Book {

    // 자바에서는 static Name = "name" 이런식으로 사용하는데
    // 코틀린에서는 companion object안에 넣음
    companion object {
        val NAME = "hello"
        fun create()= Book()

    }
}