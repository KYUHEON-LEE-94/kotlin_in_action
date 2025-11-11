package pack2

interface Expr

//클래스 Num: Expr 인터페이스를 구현한 value 프로퍼티만 존재
class Num(val value:Int): Expr
//Expr 타입의 객체라면 어떤것이든 인자가 될 수 있다.
//Num이 Sum 함수도 인자가 될 수 있다.
class Sum(val left: Expr, val right: Expr): Expr

fun eval(e:Expr): Int{
    if(e is Num){
        val n = e as Num
        return n.value
    }

    if(e is Sum){
        val n = e as Sum
        return eval(n.left) + eval(n.right)
    }

    throw IllegalArgumentException("Unknown expression")
}

fun main(){
    println(eval(Sum(Sum(Num(1),Num(2)), Num(4))))
}
