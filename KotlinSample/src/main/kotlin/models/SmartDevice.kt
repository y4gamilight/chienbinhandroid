import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

open class SmartDevice(val name: String, val category: String) {
    var speakVolume by RangeRegulator(2, 0, 100)

    var changeNumber by RangeRegulator(0, 1, 50)

    open fun turnOn() {
        println("$name is turn on")
    }

    fun increaseVolume() {
        speakVolume
    }

    fun increaseChannel() {
        changeNumber++
    }
}

class SmartTVDevice(name: String, category: String): SmartDevice(name, category) {
    override fun turnOn() {
        super.turnOn()
        println("Begin ..... ")
    }
}

class RangeRegulator(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
): ReadWriteProperty<Any?, Int> {
    private var fieldData = initialValue
    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue .. maxValue) {
            fieldData = value
        }
    }
}