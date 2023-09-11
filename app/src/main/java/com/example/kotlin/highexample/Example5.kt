package com.example.kotlin.highexample
//data class

fun main() {
    val person = Person("재용",27)
    val dog = Dog("해피",5)

    println(person.toString())
    println(dog.toString())
    println(dog.copy(age = 3).toString())

    val cat : Cat = BlueCat()
    val result = when(cat){
        is BlueCat -> "blue"
        is RedCat -> "red"
        is GreenCat -> "green"

    }
    println(result)
}

class Person(
    val name : String,
    val age: Int,

)



data class Dog( // data class 는 하나이상의 property 가 존재해야한다.
    val name: String,
    val age: Int,

)/*{
    override fun toString() : String {
        return "직접 구현 $name"
    }
}*/

//sealed class
sealed class Cat
class BlueCat : Cat() // Cat을 상속받음
class RedCat : Cat()
class GreenCat : Cat()

//abstract class 로하면 컴파일러가 Cat 이 어떤 자식을 갖고있는지 전혀모름 따라서 위에서 when 문에 else를 써야함


