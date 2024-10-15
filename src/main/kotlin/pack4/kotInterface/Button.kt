package pack4.kotInterface

/**
 *packageName    : pack4.kotInterface
 * fileName       : Button
 * author         : LEE KYUHEON
 * date           : 24. 10. 15.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 15.        LEE KYUHEON       최초 생성
 */
class Button:Clickable,Focusable {
    override fun click() = println("Button clicked")

    override fun showOff() {
        /*아래는 둘다 구현하고 있지만, 하나만 구현해서 사용해도된다.*/
        super<Clickable>.showOff()
        super<Focusable>.showoff()
    }
}

fun main() {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}