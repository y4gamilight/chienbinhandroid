package samples

class Person(val name: String,
             val age: String,
             val holby: String?,
             val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if (referrer != null) {
            println("Likes to $holby. Doesn't have a referrer. Has a referrer named ${referrer.name}, who likes to ${referrer.holby}.")
        } else {
            println("Likes to $holby. Doesn't have a referrer.\n")
        }
    }
}