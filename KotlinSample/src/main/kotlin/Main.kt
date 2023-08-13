import samples.*


fun main(args: Array<String>) {
//    val smartDevice = SmartDevice("iPhone 13 Pro", "iPhone")
//    val smartTV = SmartTVDevice(category = "androidTV", name = "Chrome Cast 3rd")
//    smartDevice.turnOn()
//    smartTV.turnOn()
//    val basicFunction = BasicFunction()
//    basicFunction.excute()
//    val mobileNotification = MobileNotification()
//    mobileNotification.excute()
//

    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true
    MovieTicketPrice(child, isMonday).desc()
    MovieTicketPrice(adult, isMonday).desc()
    MovieTicketPrice(senior, isMonday).desc()

    TemperatureFactory(27.0f,
        "Celcius",
        "Fahrenheit",
        TemperatureConvert.TemperatureConvert.celsiusToFahrenheit)
        .excute()
    TemperatureFactory(350.0f,
        "Kelvin",
        "Celcius",
        TemperatureConvert.TemperatureConvert.kelvinToCelsius)
        .excute()
    TemperatureFactory(10.0f,
        "Fahrenheit",
        "Kelvin",
        TemperatureConvert.TemperatureConvert.fahrenheitToKelvin)
        .excute()

    val person1 = Person("Thanh", "32", "Play soccer", null)
    val person2 = Person("Alice", "26", "Play guitar", person1)
    person1.showProfile()
    person2.showProfile()
}