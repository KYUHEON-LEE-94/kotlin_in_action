package pack4.objectClass

import java.io.File

/**
 *packageName    : pack4.objectClass
 * fileName       : CaseInsensitiveFileComparator
 * author         : LEE KYUHEON
 * date           : 24. 11. 13.
 * description    : Comparator 인스턴스를 만드는 방법은 객체 선언이 가장 좋은 방법이다.
 * 왜? comparator는 보통 클래스마다 하씩 있으면 된다 -> 어떤 객체가 더큰지 알려주는 정수를 반환하고, 값을 저장할 필요가 없기 때문.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 11. 13.        LEE KYUHEON       최초 생성
 */
object CaseInsensitiveFileComparator:Comparator<File> {
    override fun compare(file1: File, file2: File): Int {
        //대소문자를 구분하지 않고 비교, 동일하면 0 반환
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }
}

fun main() {
    //일반적인 사용
    println(CaseInsensitiveFileComparator.compare(File("/User"), File("/user")))

    val files = listOf(File("/z"), File("/a"))
    //sortedWith는 리스트를 주어진 Comparator에 따라서 정렬
    println(files.sortedWith(CaseInsensitiveFileComparator))
}