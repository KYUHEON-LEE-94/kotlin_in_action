package pack4.kotInterface

/**
 *packageName    : pack4.kotInterface
 * fileName       : RichButton
 * author         : LEE KYUHEON
 * date           : 24. 10. 15.
 * description    : open 상속자를 사용해야 상속할 수 있다.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 15.        LEE KYUHEON       최초 생성
 */

open class RichButton:Clickable {
    fun disable(){} // 오버라이드X
    open fun animate(){} // 오버라이드 가능
    override fun click() {} //오버라이드한 메서소드는 기본적으로 열려있다.
    //final override fun click(){} //final이 없는 override 메소드나 프로퍼티는 기본적으로 열려있다.
}