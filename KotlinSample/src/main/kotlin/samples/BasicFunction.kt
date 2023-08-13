package samples

class BasicFunction {
    val trickFunction = ::trick

    fun trick() {
        println("Trick item")
    }

    val trickSecondWay = {
        println("Second way call trick")
    }

    val treat = {
        println("Treat item")
    }

    val integerTrick: (Boolean, Int) -> Unit = { isTrick, times ->
        if (isTrick) {
            this.trickSecondWay()
        } else {
            this.treat()
        }
        println("$times times")
    }

    fun excute() {
        val callBack = this.trickSecondWay
        callBack()
        //Or call directly
        this.trickSecondWay()
        treat()
        integerTrick(false, 5)
        integerTrick(true, 3)
    }
}