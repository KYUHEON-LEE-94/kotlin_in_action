package pack4.kotInterface

/**
 *packageName    : pack4.kotInterface
 * fileName       : Animated
 * author         : LEE KYUHEON
 * date           : 24. 10. 15.
 * description    : 추상 클래스는 인스턴스 X
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 15.        LEE KYUHEON       최초 생성
 */
abstract class Animated {
    abstract fun animate() //반드시 하위 클래스에서 오버라이딩 해야함
    open fun stopAnimating() {} //오버라이드 허용
    fun animateTwice() {}  //오버라이드 허용 안됨
}