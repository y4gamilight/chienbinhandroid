package samples

class TemperatureConvert {

    object TemperatureConvert {
        val celsiusToFahrenheit: (Float) -> Float = {
            (9.0f / 5.0f ) * it + 32.0f
        }

        val kelvinToCelsius: (Float) -> Float = {
             it - 273.15f
        }

        val fahrenheitToKelvin: (Float) -> Float = {
            (5.0f / 9.0f) * (it - 32.0f) + 273.15f
        }
    }
}

class TemperatureFactory(
    val initialMeasurement: Float,
    val initialUnit: String,
    val finalUnit: String,
    val convertFunction: (Float) -> Float
    ) {
    fun excute() {
        val finalMeasurement = String.format("%.2f", convertFunction(initialMeasurement)) // two decimal places
        println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")

    }

}