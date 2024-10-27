package pack4.classType

/**
 *packageName    : pack4.innerClass
 * fileName       : Outer
 * author         : LEE KYUHEON
 * date           : 24. 10. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 27.        LEE KYUHEON       최초 생성
 */
class Outer {
    inner class Inner{
        //내부에서 바깥 클래스 Outer 참소에 접근하려면 this@Outer 라고 써야함
        fun getOuterReference(): Outer = this@Outer
    }
}