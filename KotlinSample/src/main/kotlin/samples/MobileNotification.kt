package samples

class MobileNotification {
    val morningNotification: Int = 51
    val eveningNotification: Int = 135

    fun excute() {
        printNotification(morningNotification)
        printNotification(eveningNotification)
    }
    fun printNotification(number: Int) {
        if (number > 99) {
            println("Your phone is blowing up! You have 99+ notifications.")
        } else {
            println("You have $number notifications.")
        }
    }
}