package com.example.kotlin

fun main() {
    val user = User("김재용")
    println(user.age)
    val kid = Kid("아이",3,"male")

}
 //상속
open class User(open val name : String, open var age: Int = 100)

class Kid(override val name: String, override var age: Int) : User(name,age){
    var gender : String = "female"

    init {
        println("초기화 중입니다")
    }

    constructor(name : String, age: Int, gender: String) : this(name, age){
        this.gender = gender
        println("부생성자 호출")
    }
}