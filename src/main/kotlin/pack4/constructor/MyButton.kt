package pack4.constructor

import javax.naming.Context
import javax.print.attribute.AttributeSet

/**
 *packageName    : pack4.constructor
 * fileName       : MyButton
 * author         : LEE KYUHEON
 * date           : 24. 10. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 27.        LEE KYUHEON       최초 생성
 */
class MyButton:View {
    //constructor(ctx:Context):this(ctx, MY_STYLE) {} // 이 클래스의 다른 생성자에게 위임
    constructor(ctx: Context, attr:AttributeSet):super(ctx,attr) {}
}