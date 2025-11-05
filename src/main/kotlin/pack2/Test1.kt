package pack2

import java.util.TreeMap

/**
 *packageName    :
 * fileName       : pack2.Test1
 * author         : LEE KYUHEON
 * date           : 2024-10-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-06        LEE KYUHEON       최초 생성
 */
class Test1 {


    //식이 본문인 함수
    fun max(a:Int, b:Int):Int = if(a>b) a else b
    //본문 타입 생략 -> 타입 추론
    fun max2(a:Int, b:Int) = if(a>b) a else b

    fun mix(c1:Color, c2:Color) =
        when(setOf(c1, c2)){
            setOf(Color.RED) -> Color.ORANGE
            setOf(Color.ORANGE, Color.RED) -> Color.RED
            else -> throw Exception("No color")
        }

    fun recognize(c:Char) = when(c){
        in '0'..'9' -> "It's digit!"
        in 'a' .. 'z', in 'A' .. 'Z' -> "It;s a letter"
        else -> "i don't know"
    }
}

fun main() {
    val languages = arrayListOf("Java") //불변이어도
    languages.add("Kotlin") //객체값 변경 가능

    val person = Person("Bob", false)
    val isMarried = if(person.isMarried) "married" else "not married"
    println("${person.name} is $isMarried")
    //iter
//    for (i in 100 downTo 1 step 2){
//        print("i는? $i")
//    }

    //Map iter
    val binaryReps = TreeMap<Char,String>()
    for (c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.code)
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps){
        println("$letter = $binary")
    }
}
