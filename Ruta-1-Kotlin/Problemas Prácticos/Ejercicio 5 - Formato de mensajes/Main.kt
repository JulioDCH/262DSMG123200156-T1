/* Problema 5: Formato de mensajes
 * Este programa muestra el salario total que recibe un empleado este mes.
 * El salario se divide entre baseSalary y bonusAmount.
 *
 * fun main() {
 *     val baseSalary = 5000
 *     val bonusAmount = 1000
 *     val totalSalary = "$baseSalary + $bonusAmount"
 *     println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
 * }
 *
 * 1. ¿Puedes determinar el resultado de este código antes de ejecutarlo en Kotlin Playground?
 * 2. Cuando ejecutas el código en Kotlin Playground, ¿se imprime el resultado que esperabas?
 */

// Respuesta 1:
// El resultado sería: "Congratulations for your bonus! You will receive a total of 5000 + 1000 (additional bonus)."
// porque las variables se insertan como texto y el signo + está dentro de la cadena.

// Respuesta 2:
// No, el resultado no es el esperado, porque se muestra "5000 + 1000" en lugar de realizar la suma.
// Para obtener el salario total se debe realizar la operación fuera de las comillas.

// Código corregido:
fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
