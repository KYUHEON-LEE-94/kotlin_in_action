package pack2

/**
 *packageName    : pack2
 * fileName       : Color
 * author         : LEE KYUHEON
 * date           : 2024-10-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-06        LEE KYUHEON       최초 생성
 */
enum class Color(
    val r:Int,
    val g:Int,
    val b:Int
) {
    RED(255,0,0),
    ORANGE(255,165,0);

    fun rgb()=(r * 256 +g) * 256 + b

}