package pack4.kotInterface

/**
 *packageName    : pack4.kotInterface
 * fileName       : Clickable
 * author         : LEE KYUHEON
 * date           : 24. 10. 15.
 * description    : 코틀린 인터페이스에는 추상 메소드뿐 아니라, 구현이 있는 메소드도 정의 가능.
 * 다만, 아무런 상태도 들어갈 수 없다.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 15.        LEE KYUHEON       최초 생성
 */
interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable")
}