// Returns the perfect square of a given number
fun perfectSquare(num: Int): Int {
    return num * num

    // If adjusted for inputs where the input type could be a variable type other than an Int
    /* when (num) {
        is Int -> return num * num
        else -> return println("Invalid input. Please try again.")
    } */
}

// Runs the program
fun main() {
    println(perfectSquare(16))
}

main()
