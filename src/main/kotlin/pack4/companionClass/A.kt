package pack4.companionClass

/**
 *packageName    : pack4.companionClass
 * fileName       : A
 * author         : LEE KYUHEON
 * date           : 24. 11. 13.
 * description    :코틀린에는 static 키워드가 없다.
 * 대신에 패키지 수준의 최상위 함수와 객체 선언을 활용한다.
 * 최상위 함수를 사용하는 것을 권장하지만 private로 표시된 클래스 비공개 멤버에는 접근 불가.
 *
 * 동반객체는 자신을 둘러싼 클래스의 모든 private 멤버에 접근 가능.
 * 따라서 동반 객체는 바깥쪽 클래스의 private 생성자도 호출할 수 있다.
 * 팩토리 패턴 구현에 가장 적합하다.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 11. 13.        LEE KYUHEON       최초 생성
 */
class A {
    //클래스의 동반 객체
    companion object {
        fun bar(){
            println("Companion object called")
        }
    }
}

fun main() {
    A.bar()
}