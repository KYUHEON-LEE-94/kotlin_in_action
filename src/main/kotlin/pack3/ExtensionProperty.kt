package pack3

/**
 *packageName    : pack3
 * fileName       : ExtensionProperty
 * author         : LEE KYUHEON
 * date           : 24. 10. 9.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 9.        LEE KYUHEON       최초 생성
 */
class ExtensionProperty {

}
/**
 * can not have status
 *
 * **/
var StringBuilder.lastChar: Char
    get() = get(length-1)
    set(value:Char){
        this.setCharAt(length-1, value)
    }


fun main() {
    println("Kotlin".lastChar())

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'

    println(sb)
}