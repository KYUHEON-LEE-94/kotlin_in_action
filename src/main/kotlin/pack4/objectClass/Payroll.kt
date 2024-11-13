package pack4.objectClass

import pack2.Person

/**
 *packageName    : pack4.objectClass
 * fileName       : Payroll
 * author         : LEE KYUHEON
 * date           : 24. 11. 13.
 * description    : 클래스를 저의하면서 동시에 인스턴스를 생성한다는 공통점이 있다.
 * 사용하는 상황:
 *  1. 객체 선언(object)은 싱글턴을 정의하는 방법 중 하나
 *  2. 동반 객체(companion object)는 인스턴스 메소드는 아니지만 어떤 클래스와 관련 있는 메서드와 팩토리 메서드를 담을 때 쓴다.
 *  3. 객체 식은 자바의 무명 내부 클래스 대신 쓰인다.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 11. 13.        LEE KYUHEON       최초 생성
 */

/*싱글턴*/
object Payroll {
    val allEmployees = arrayListOf<Person>()
    fun calculateSalary() {
        for(person in allEmployees) {
            //TODO
        }
    }
}

fun main() {
    //사용법
    Payroll.allEmployees.add(Person("maria",true))
}