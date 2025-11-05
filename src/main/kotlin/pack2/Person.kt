package pack2

/**
 *packageName    :
 * fileName       : pack2.Person
 * author         : LEE KYUHEON
 * date           : 2024-10-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-06        LEE KYUHEON       최초 생성
 */
class Person(
    val name: String,      // 읽기 전용 프로퍼티 (setter 없음, getter만 생성됨) -> 객체 생성 후 값을 변경할 수 없음
    var isMarried: Boolean // 읽고 쓸 수 있는 프로퍼티 (getter + setter 생성됨)
)