/*6. Message formatting
This program displays the total salary that an employee receives this month. The total salary is divided in two parts: the baseSalary variable, which the employee receives every month, and the bonusAmount variable, which is an additional bonus awarded to the employee.


fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
Can you figure out the output of this code before you run it in Kotlin Playground?
When you run the code in Kotlin Playground, does it print the output that you expected?*/

fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
