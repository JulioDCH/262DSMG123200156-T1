/* Problema 8: Podómetro
 * El programa calcula la cantidad de calorías quemadas según la cantidad de pasos realizados.
 *
 * ¿Puedes cambiar el nombre de las funciones, de los parámetros de las funciones y de las
 * variables utilizados en este programa según las prácticas recomendadas?
 *
 * fun main() {
 *     val Steps = 4000
 *     val caloriesBurned = PEDOMETERstepsTOcalories(Steps);
 *     println("Walking $Steps steps burns $caloriesBurned calories")
 * }
 *
 * fun PEDOMETERstepsTOcalories(NumberOFStepS: Int): Double {
 *     val CaloriesBURNEDforEachStep = 0.04
 *     val TotalCALORIESburned = NumberOFStepS * CaloriesBURNEDforEachStep
 *     return TotalCALORIESburned
 * }
 */

fun main() {
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps)
    println("Walking $steps steps burns $caloriesBurned calories") 
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}
