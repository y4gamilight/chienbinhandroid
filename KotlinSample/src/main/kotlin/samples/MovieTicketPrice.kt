package samples

class MovieTicketPrice(val age: Int, val isMonday: Boolean) {
    val childAgeLimit = 12
    val childPrice = 15
    val adultAgeLimit = 60
    val adultPrice = 30
    val seniorPrice = 20

    fun desc() {
        println("The movie ticket price for a person aged $age is \$${price()}.")
    }

    fun price(): Int {
        if (age >= 0 && age <= childAgeLimit) {
            return childPrice
        } else if (age > childAgeLimit && age <= adultAgeLimit) {
            return if (isMonday) adultPrice - 5 else adultPrice
        } else if (age > adultAgeLimit) {
            return seniorPrice
        } else {
            return -1
        }
    }
}