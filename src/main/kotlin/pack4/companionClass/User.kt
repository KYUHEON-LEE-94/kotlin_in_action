package pack4.companionClass

/**
 *packageName    : pack4.companionClass
 * fileName       : User
 * author         : LEE KYUHEON
 * date           : 24. 11. 13.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 11. 13.        LEE KYUHEON       최초 생성
 */
class User private constructor(val nickname: String) {

    companion object {
        fun newSubscribingUser(email: String) = User(email.substringBefore('@'))

        fun newFacebookUser(accountId:Int) = User(getFacebookName(accountId))

        private fun getFacebookName(accountId:Int):String{
            return accountId.toString() + "facebook"
        }
    }


}

fun main() {
    val subscribeUser = User.newSubscribingUser("bob@gmail.com")
    val facebookUser = User.newFacebookUser(4)
    println(subscribeUser.nickname)
    println(facebookUser.nickname)
}