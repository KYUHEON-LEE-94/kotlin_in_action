package pack4.classType

/**
 *packageName    : pack4.classType
 * fileName       : Expr
 * author         : LEE KYUHEON
 * date           : 24. 10. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 27.        LEE KYUHEON       최초 생성
 */
/**
 * 기반 클래스를 sealed 로 봉인. 상속하는 하위 클래스 정의를 제한
 * sealed 는 open 변경자
 * **/
sealed class Expr {
    //기반 클래스의 모든 하위 클래스를 중첩 클래스로 나열
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e:Expr) : Int =
    // when 식이 모든 하위 클래스를 검사하므로 별도의 else 분기가 없어도 된다.
    when(e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.left) + eval(e.right)
    }