@file:JvmName("StringFunctions") // 클래스 이름 지정 어노테이션 p113
package pack3

/**
 *packageName    : pack3
 * fileName       : join
 * author         : LEE KYUHEON
 * date           : 24. 10. 8.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 8.        LEE KYUHEON       최초 생성
 */
fun <T> joinToString(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String{
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()){
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

//default Param 지정
fun <T> joinToString2(
    collection: Collection<T>,
    separator: String = "," ,
    prefix: String = "",
    postfix: String = ""
): String{
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()){
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun String.lastChar():Char = get(length-1) // 수신 객체 멤버에 this 없이 접근


fun <T> Collection<T>.joinToString3(
    separator: String = "," ,
    prefix: String = "",
    postfix: String = ""
): String{
    val result = StringBuilder(prefix)
    //this는 수신 객체. 여기서는 T 타입의 원소로 이뤄진 컬렉션
    for ((index, element) in this.withIndex()){
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}