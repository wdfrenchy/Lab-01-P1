import khoury.input
import khoury.testSame
import khoury.EnabledTest
import khoury.runEnabledTests

// Returns whether the user's inputted word starts with the user's inputted letter
fun startsWithY(word: String): Unit {
    if(word.substring(0,1) == "Y") {
        println("Your word starts with \"Y\".")
    }
    else if(word.substring(0,1) == "y") {
        println("Your word starts with \"y\".")
    }
    else {
        println("Your word does not start with \"Y\".")
    }
}

// Returns whether or not a given word starts with a given letter
fun startsWith(): Unit {
    print("Input a letter: ")
    val letter = input()
    print("Input a word: ")
    val word = input()
    if (word.substring(0,1).equals(letter)) {
        println("Your word starts with " + letter + ".")
    }
    else {
        println("Your word does not start with " + letter + ".")
    }
}

@EnabledTest
fun testStartsWithY() {
    testSame(startsWithY("Frenchy"), false, "Checking if the program properly assigns a word not starting with \"Y\" false")
    testSame(startsWithY("Yellowstone"), true, "Checking if the program properly assigns a word starting with \"Y\" true")
}

// Runs the program
fun main(){
    startsWith()
}

main()

runEnabledTests(this)
