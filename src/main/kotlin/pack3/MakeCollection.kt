package pack3

/**
 *packageName    : pack3
 * fileName       : MakeCollection
 * author         : LEE KYUHEON
 * date           : 24. 10. 8.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 8.        LEE KYUHEON       최초 생성
 */

fun main() {
    val set = hashSetOf(1, 7, 53)

    val list = arrayListOf(1, 7, 53)

    // to는 일반 함수
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    /**
     * 자바의 컬렉션을 제공
     * **/
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
}