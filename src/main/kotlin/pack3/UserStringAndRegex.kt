package pack3

/**
 *packageName    : pack3
 * fileName       : UserStringAndRegex
 * author         : LEE KYUHEON
 * date           : 24. 10. 9.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 9.        LEE KYUHEON       최초 생성
 */
class UserStringAndRegex {
}

fun main() {
    //regex
    println("12.345-6.A".split("\\.|-".toRegex()))

    // override 'split' method
    println("12.345-6.A".split(".", "-"))

    parsePath("/Users/user/kotlin/chapter3.word")
}

fun parsePath(path:String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir : $directory, fullName : $fullName, fileName : $fileName, extension : $extension ")
}