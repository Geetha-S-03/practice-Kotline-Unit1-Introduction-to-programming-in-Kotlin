/*7. Implement basic math operations
he code works, but the logic for adding two numbers is located within the result variable, making your code less flexible to reuse. Instead, you can extract the addition operation into an add() function so that the code is reusable. To do this, update your code with the code listed below. Notice that the code now introduces a new val called thirdNumber and prints the result of this new variable with firstNumber.


fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// Define add() function below this line
Can you define the add() function so that the program prints this output?

10 + 5 = 15
10 + 8 = 18
Step 3
Now you have a reusable function to add two numbers.

Can you implement the subtract() function the same way you implemented the add() function? Modify the main() function as well to use the subtract() function so you can verify that it works as expected.
Hint: Think about the difference between addition, subtraction and other math operations. Start work on the solution code from there.*/

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8    
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}
fun add(firstNumber:Int,secondNumber:Int=0,thirdNumber:Int=0):String{
    val r=firstNumber+secondNumber+thirdNumber
    return "$r"
}
