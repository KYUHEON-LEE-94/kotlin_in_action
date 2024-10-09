package pack3

/**
 *packageName    : pack3
 * fileName       : WhatisTO
 * author         : LEE KYUHEON
 * date           : 24. 10. 9.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 9.        LEE KYUHEON       최초 생성
 */
class WhatisTO {
    /**
     * 중위 호출이라는 특별한 방식으로 to라는 일반 메서드를 호출 한것
     * **/
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")

    // 1.to("one") 일반적인 메서드 호출
    // 1 to "one" to메서드를 중위 호출 방식으로 호출

    //infix 선언으로 중위 호출 사용 가능
    infix fun Any.to2(other:Any) = Pair(this, other)
    val map2 = mapOf(1 to2 "one", 2 to2 "two", 3 to2 "three")
}

