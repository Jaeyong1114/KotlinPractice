package com.example.kotlin

fun main(){
    max(10,3)
    isHoliday("금")
}

fun max(a : Int , b: Int){
  /*  if(a>b){
        println(a)
    } else{
        println(b)
    }*/
    /*val result = if(a>b) {
        a
    } else {
        b
    }
    println(result)
*/
    val result = if(a>b) a else b
    println(result)
}

// 월 화 수 목 금 토 일
fun isHoliday(dayOfWeek: String) {
    val result = when (dayOfWeek) {
        /*"월" ,
        "화" ,
        "수" ,
        "목" ,
        "금" -> false
        "토" ,
        "일" -> true*/
        "토",
        "일" -> true
        else -> false
    }
    println(result)

}

