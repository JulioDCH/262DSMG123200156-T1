/* Problema 7: Parámetros predeterminados
 * En este ejercicio se debe implementar una función displayAlertMessage() que muestre
 * un mensaje de alerta indicando el sistema operativo y el correo del usuario.
 *
 * Paso 1:
 *
 * fun main() {
 *     val operatingSystem = "Chrome OS"
 *     val emailId = "sample@gmail.com"
 *
 *     println(displayAlertMessage(operatingSystem, emailId))
 * }
 *
 * ¿Puedes implementar la función displayAlertMessage() para que imprima:
 * There's a new sign-in request on Chrome OS for your Google Account sample@gmail.com.
 *
 * ¿El programa imprime este resultado?
 *
 */

// Solución 1: Implementando función displayAlertMessage()
fun main() {
    val operatingSystem = "Chrome OS"
	val emailId = "sample@gmail.com"
	
	println(displayAlertMessage(operatingSystem, emailId))
}

fun displayAlertMessage(operatingSystem: String, emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}
