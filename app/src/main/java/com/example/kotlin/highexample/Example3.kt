package com.example.kotlin.highexample

/* Scope Function(범위 지정 함수 )
코틀린 표준 라이브러리에서 제공하는 확장함수
목적: 간결성 ,명료성 , 유지보수 용이성
정의: 객체의 컨텍스트 내에서 ,실행 가능한 코드 블럭을 만드는 함수
    호출 시 , 임시 범위가 생성되며, 이 범위 안에서는 이름 없이 객체에 접근가능
    context: 문맥 , 맥락 ,전 후 사정    즉 객체 내에서 실행가능한 코드블럭을 만듬.
    수신객체: 확장 함수가 호출되는 대상이 되는 값 (객체)

   차이점
    수신 객체 접근 방법: this ,it
    Return 값 : 수신객체 , 마지막 행 (lambda result)
 */

fun main() {
    // let , run , apply , also   with
    //1. let
    val a = 3
    a.let { }
    val user = User("김재용", 27, false)


    // 수신객체.let { it(user)  ->
    //
    // 마지막 줄 // return
    // }
    val age = user.let {
        user.age
    }
    println(age)


    //2. run
    // 수신객체.run { this ->
    //
    // 마지막 줄
    //}
    val kid = User("아이", 4, false)
    val kidAge = kid.run {
        age

    }
    println(kidAge) //let 관 run의 차이는 수신객체를 받는차이


    // 3. apply
    //수신객체.apply {
    //  어떤값을 중간에쓰든 상관없음
    //}                                    run 과의 차이는 받는건 똑같이 this 로 받지만  return 값이 자기자신임.
    // return 값이 수신객체( 자기 자신)
    val female = User("슬기",20,true,true)
    val femaleValue = female.apply{
        hasGalasses = false
    }
    println(femaleValue.hasGalasses)

    //4. also
    //수신객체.also { it -> // local varaiable
    //
    //
    // } // return 은 수신객체( 자기자신)

    val male = User("민수", 17, false , true)
    val maleValue =male.also {user->  // also 는 봍통 user-> 로 쓰는게아니라 it 으로 로그 찍을때 사용
        user.name
        user.hasGalasses = false

    }
    val maleValue2 = male.also{
        println(it.name)
    }

    println(maleValue.hasGalasses)

    //5. with
    // with(수신객체) { this로접근
    // ---
    // 마지막 줄 return
    // }
    val result = with(male){
        hasGalasses = false
        true
    }
}
class User(
    val name : String,
    val age : Int,
    val gender : Boolean, // true : female , false: male
    var hasGalasses : Boolean = true,
)
