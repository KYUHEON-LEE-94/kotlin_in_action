package pack4.kotInterface

/**
 *packageName    : pack4.kotInterface
 * fileName       : Focusable
 * author         : LEE KYUHEON
 * date           : 24. 10. 15.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 15.        LEE KYUHEON       최초 생성
 */
interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus")

    fun showoff() = println("I'm focusable!")
}