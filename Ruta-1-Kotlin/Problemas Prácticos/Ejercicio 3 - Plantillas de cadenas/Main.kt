/* Problema 3: Plantillas de cadenas
 * Este programa informa a los usuarios sobre la próxima oferta promocional de un 
 * artículo en particular. Tiene una plantilla de cadenas, que se basa en la variable 
 * discountPercentage para el porcentaje de descuento y la variable item para el 
 * artículo en oferta. Sin embargo, existen errores de compilación en el código.
 *
 * fun main() {
 *     val discountPercentage: Int = 0
 *     val offer: String = ""
 *     val item = "Google Chromecast"
 *     discountPercentage = 20
 *     offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
 *
 *     println(offer)
 * }
 *
 * 1. ¿Puedes determinar la causa raíz de esos errores y corregirlos?
 * 2. ¿Puedes determinar el resultado de este programa antes de ejecutar el código en Kotlin Playground?
 */

// Respuesta 1:
// La variable discountPercentage y offer se han declarado como variables fijas, osea con val,
// sin embargo estos deben ser con var, ya que van a variar sus valores.
// Código corregido:
fun main() {
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}

// Respuesta 2:
// Sí al corregir el código el resultado seria: 
// // "Sale - Up to 20% discount on Google Chromecast! Hurry up!"
