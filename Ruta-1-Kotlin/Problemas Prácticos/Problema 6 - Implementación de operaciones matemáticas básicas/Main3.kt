/* Problema 6: Implementación de operaciones matemáticas básicas
 * En este ejercicio se realizan operaciones matemáticas básicas y se imprime el resultado.
 *
 * Paso 3:
 * ¿Puedes implementar la función subtract() de la misma manera que add() y modificar
 * la función main() para utilizarla y comprobar que funciona correctamente?
 *
 * fun main() {
 *     val firstNumber = 10
 *     val secondNumber = 5
 *     val thirdNumber = 8
 *
 *     val result = add(firstNumber, secondNumber)
 *     val anotherResult = add(firstNumber, thirdNumber)
 *
 *     println("$firstNumber + $secondNumber = $result")
 *     println("$firstNumber + $thirdNumber = $anotherResult")
 * }
 */

// Solución 3:
fun main() {
	val firstNumber = 10
	val secondNumber = 5
	val thirdNumber = 8
	
    val result = subtract(firstNumber, secondNumber)
 	val anotherResult = subtract(firstNumber, thirdNumber)
    
	println("$firstNumber - $secondNumber = $result")
	println("$firstNumber - $thirdNumber = $anotherResult")
}

fun subtract(num1: Int, num2: Int): Int {
    val resta = num1 - num2
    return resta
}
