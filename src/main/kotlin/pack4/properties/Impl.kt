package pack4.properties

/**
 *packageName    : pack4.properties
 * fileName       : Impl
 * author         : LEE KYUHEON
 * date           : 24. 11. 3.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 11. 3.        LEE KYUHEON       최초 생성
 */
class PrivateUser(override val nickname: String): User

class SubscribeUser(private val email:String): User{
    override val nickname: String
        get() = email.substringBefore('@') //커스텀 게터
}

class FacebookUser(private val accountId:Int):User{
    fun getFacebookName(accountId: Int): String{
        return "${accountId}_$accountId"
    }
    override val nickname: String = getFacebookName(accountId)
}