package pack3

/**
 *packageName    : pack3
 * fileName       : Refactor
 * author         : LEE KYUHEON
 * date           : 24. 10. 15.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 15.        LEE KYUHEON       최초 생성
 */
class User(val id:Int, val name:String, val address:String)

fun User.validateBeforeSave(){
    fun validate(value:String, fieldName:String){
        if(value.isEmpty()){
            throw IllegalArgumentException(
                "Can't save user $id empty $fieldName"
            )
        }
    }

validate(name, "Name")
validate(address, "Address")
}

fun saveUser(user: User){
    user.validateBeforeSave()
}