package pack2

import pack2.Color.*

fun getMnemonic(color: Color) =
    when(color){
        RED -> "Richard"
        ORANGE -> "of"
        YELLOW -> "York"
        GREEN -> "Gave"
        BLUE -> "Battle"
        INDIGO -> "In"
        VIOLET -> "Vain"
    }

fun getWarmth(color: Color) =
    when(color){
        RED, ORANGE, YELLOW -> "warm"
        GREEN -> "neutral"
        BLUE, INDIGO, VIOLET -> "cold"
    }