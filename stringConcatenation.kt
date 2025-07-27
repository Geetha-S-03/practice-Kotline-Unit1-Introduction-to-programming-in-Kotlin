/* String concatenation
This program displays the total party size. There are adults and kids at the party. The numberOfAdults variable holds the number of adults at the party and the numberOfKids variable holds the number of kids.


fun main() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
Step 1
Can you determine the output of this program before you run the code in Kotlin Playground?
After you determine the output, run the code in Kotlin Playground and then check if your output matches the output displayed.

Hint: What happens when you use the + operator on two strings?

Step 2
The code works and prints some output, but the output doesn't show the total number of people attending the party.

Can you find the issue in the code and fix it so that it prints this output?

"The total party size is: 50"*/

fun main() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
