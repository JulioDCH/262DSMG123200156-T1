/* Problema 6: Implementación de operaciones matemáticas básicas
 * En este ejercicio se realizan operaciones matemáticas básicas y se imprime el resultado.
 *
 * Paso 2:
 * Se debe crear una función add() para realizar la suma de dos números y poder reutilizarla.
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
 *
 * ¿Puedes definir la función add() para que el programa imprima:
 * 10 + 5 = 15
 * 10 + 8 = 18
 */

// Solución 2:
fun main() {
	val firstNumber = 10
	val secondNumber = 5
	val thirdNumber = 8
	
    val result = add(firstNumber, secondNumber)
 	val anotherResult = add(firstNumber, thirdNumber)
    
	println("$firstNumber + $secondNumber = $result")
	println("$firstNumber + $thirdNumber = $anotherResult")
}

fun add(num1: Int, num2: Int): Int {
    val suma = num1 + num2
    return suma
}
