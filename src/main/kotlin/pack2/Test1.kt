package pack2

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

    fun getMnemonic(color: Color) =
        when(color){
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
        }

    fun getWarm(color: Color) =
        when(color){
            Color.RED, Color.ORANGE  -> "warm"
        }

    fun mix(c1:Color, c2:Color) =
        when(setOf(c1, c2)){
            setOf(Color.RED) -> Color.ORANGE
            setOf(Color.ORANGE, Color.RED) -> Color.RED
            else -> throw Exception("No color")
        }
}

fun main() {
    val languages = arrayListOf("Java") //불변이어도
    languages.add("Kotlin") //객체값 변경 가능
}