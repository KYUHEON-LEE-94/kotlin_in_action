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

fun saveUser(user:User){
    fun validate(value:String, fieldName:String){
        if(value.isEmpty()){
            throw IllegalArgumentException(
                "Can't save user ${user.id} empty $fieldName"
            )
        }
    }

validate(user.name, "Name")
validate(user.address, "Address")
}

