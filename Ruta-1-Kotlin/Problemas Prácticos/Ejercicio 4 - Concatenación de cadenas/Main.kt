/* Problema 4: Concatenación de cadenas
 * Este programa muestra la cantidad total de personas en una fiesta, entre adultos y niños.
 * La variable numberOfAdults contiene la cantidad de adultos y numberOfKids la cantidad de niños.
 *
 * fun main() {
 *     val numberOfAdults = "20"
 *     val numberOfKids = "30"
 *     val total = numberOfAdults + numberOfKids
 *     println("The total party size is: $total")
 * }
 *
 * Paso 1:
 * ¿Puedes determinar el resultado de este programa antes de ejecutar el código en Kotlin Playground?
 *
 * Paso 2:
 * ¿Puedes encontrar el problema del código y corregirlo para que imprima:
 * "The total party size is: 50"?
 */

// Respuesta 1:
// El resultado sería: "The total party size is: 2030", porque numberOfAdults y numberOfKids
// están declaradas como cadenas de texto y el operador + las concatena.

// Respuesta 2:
// El problema es que las cantidades están declaradas como String. Deben ser valores numéricos
// para poder realizar una suma.

// Código corregido:
fun main() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
