/*String templates
This program informs users about the upcoming promotional sale on a particular item. It has a string template, which relies on the discountPercentage variable for the percent discount and the item variable for the item on sale. However, there are compilation errors in the code.


fun main() {
    val discountPercentage: Int = 0
    val offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}
Can you figure out the root cause of the errors and fix them?
Can you determine the output of this program before you run the code in Kotlin Playground?
Hint: Can you re-assign a value to a read-only variable?

After you fix the errors, the program should compile without errors and print this output:


Sale - Up to 20% discount on Google Chromecast! Hurry up!*/


fun main() {
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}
