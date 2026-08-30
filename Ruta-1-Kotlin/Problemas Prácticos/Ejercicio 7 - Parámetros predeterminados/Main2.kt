/* Problema 7: Parámetros predeterminados
 * En este ejercicio se debe implementar una función displayAlertMessage() que muestre
 * un mensaje de alerta indicando el sistema operativo y el correo del usuario.
 *
 * Paso 2:
 * En algunos casos no se puede determinar el sistema operativo, por lo que se debe utilizar
 * "Unknown OS" como valor predeterminado.
 *
 * ¿Puedes optimizar la función utilizando un parámetro predeterminado para que imprima:
 *
 * There's a new sign-in request on Unknown OS for your Google Account user_one@gmail.com.
 * There's a new sign-in request on Windows for your Google Account user_two@gmail.com.
 * There's a new sign-in request on Mac OS for your Google Account user_three@gmail.com.
 *
 * Código para comprobar la función:
 *
 * fun main() {
 *     val firstUserEmailId = "user_one@gmail.com"
 *
 *     println(displayAlertMessage(emailId = firstUserEmailId))
 *     println()
 *
 *     val secondUserOperatingSystem = "Windows"
 *     val secondUserEmailId = "user_two@gmail.com"
 *
 *     println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
 *     println()
 *
 *     val thirdUserOperatingSystem = "Mac OS"
 *     val thirdUserEmailId = "user_three@gmail.com"
 *
 *     println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
 *     println()
 * }
 */

// Solución 2: Implementando función displayAlertMessage() con parámetro predeterminado
fun main() {
    val firstUserEmailId = "user_one@gmail.com"
    println(displayAlertMessage(emailId = firstUserEmailId))
	println()
    
    val secondUserOperatingSystem = "Windows"
	val secondUserEmailId = "user_two@gmail.com"
    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()
    
    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"
    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}
