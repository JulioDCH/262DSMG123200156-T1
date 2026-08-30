/* Problema 10: Movimiento del código duplicado a una función
 * Este programa muestra el clima de diferentes ciudades, incluyendo el nombre de la ciudad,
 * las temperaturas máxima y mínima y la probabilidad de lluvia.
 *
 * fun main() {
 *     println("City: Ankara")
 *     println("Low temperature: 27, High temperature: 31")
 *     println("Chance of rain: 82%")
 *     println()
 *
 *     println("City: Tokyo")
 *     println("Low temperature: 32, High temperature: 36")
 *     println("Chance of rain: 10%")
 *     println()
 *
 *     println("City: Cape Town")
 *     println("Low temperature: 59, High temperature: 64")
 *     println("Chance of rain: 2%")
 *     println()
 *
 *     println("City: Guatemala City")
 *     println("Low temperature: 50, High temperature: 55")
 *     println("Chance of rain: 7%")
 *     println()
 * }
 *
 * 1. ¿Puedes crear una función que imprima los detalles del clima de una sola ciudad para
 * reducir la repetición en la función main()?
 *
 * 2. ¿Puedes actualizar la función main() para llamar a la función creada para cada ciudad
 * y pasar los detalles apropiados del clima como argumentos?
 */

// Solución 10:
fun main() {
    printWeather("Ankara", 27, 31, 82)
    printWeather("Tokyo", 32, 36, 10)
    printWeather("Cape Town", 59, 64, 2)
    printWeather("Guatemala City", 50, 55, 7)
}

fun printWeather(city: String, lowTemperature: Int, highTemperature: Int, chanceOfRain: Int) {
    println("City: $city")
    println("Low temperature: $lowTemperature, High temperature: $highTemperature")
    println("Chance of rain: $chanceOfRain%")
    println()
}
