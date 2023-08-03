package kotlin

class KotlinApp {
    public fun getGreeting(): String {
        return "Hello Kotlin developer"
    }
}

fun main() {
    println(KotlinApp().getGreeting())
}