package pack3

/**
 *packageName    : pack3
 * fileName       : ExtensionFunctionNotOverrid
 * author         : LEE KYUHEON
 * date           : 24. 10. 9.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 9.        LEE KYUHEON       최초 생성
 */
class ExtensionFunctionNotOverride {

    //Normal Case
    open class View{
        open fun click () = println("View clicked")
    }

    open class Button: View(){
        override fun click() = println("Button clicked")
    }

    //extension Function
    fun View.showOff() = println("View show off")
    fun Button.showOff() = println("Button show off")
}