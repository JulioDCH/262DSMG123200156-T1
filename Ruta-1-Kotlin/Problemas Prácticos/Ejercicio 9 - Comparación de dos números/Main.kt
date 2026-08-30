/* Problema 9: Comparación de dos números
 * En este ejercicio se implementará una función que compara la cantidad de minutos de uso
 * del teléfono de hoy y ayer. La función debe devolver true si hoy se utilizó el teléfono
 * durante más tiempo que ayer y false en caso contrario.
 *
 * Por ejemplo:
 * timeSpentToday = 300 y timeSpentYesterday = 250 → true
 * timeSpentToday = 300 y timeSpentYesterday = 300 → false
 * timeSpentToday = 200 y timeSpentYesterday = 220 → false
 *
 * ¿Puedes implementar la función para comparar correctamente los dos números utilizando
 * el operador de comparación >?
 */

// Solución:
fun main() {
    println(compareUsage(timeSpentToday = 300, timeSpentYesterday = 250))
    println(compareUsage(timeSpentToday = 300, timeSpentYesterday = 300))
    println(compareUsage(timeSpentToday = 200, timeSpentYesterday = 220))
}

fun compareUsage(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}
