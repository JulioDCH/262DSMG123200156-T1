/* Problema 2: Este programa imprime un mensaje que le notifica 
 * al usuario que recibió un mensaje de chat de un amigo.
 *  fun main() { 
 *   	println("New chat message from a friend'}
 *	}
 * 1. ¿Puedes determinar la causa raíz de los errores de compilación de este programa y corregirlos?
 * 2. ¿El código usa los símbolos apropiados para indicar la apertura y el cierre de la cadena 
 *    y el argumento de la función?
 */

// Respuesta 1: 
// Hay 2 causas por las que sucede este error. Primero, la cadena de texto debe estar 
// encerrada entre comillas dobles (" "). Segundo, falta cerrar correctamente el paréntesis 
// de la función println(). 

// Respuesta 2: 
// No, el código no usa los símbolos apropiados. Se deben utilizar comillas dobles para 
// abrir y cerrar la cadena de texto y paréntesis para indicar el argumento de la función.

// Código corregido
fun main() { 
    println("New chat message from a friend")
}
