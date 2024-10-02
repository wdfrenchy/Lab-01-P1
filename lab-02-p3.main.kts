import khoury.input
import khoury.testSame
import khoury.isAnInteger
import khoury.captureResults
import khoury.CapturedResult
import khoury.EnabledTest
import khoury.runEnabledTests

// Creates a student class and a student data type
data class Student (val fore: String, val mid: String, val last: String)

// Returns a nametag to be used in other functions
fun getNametag(name: Student): String {
    return "${name.last.uppercase()}, ${name.fore} ${name.mid}"
}

// Compares one student's score to another student's score
fun getCardLength(student: Student): Int {
   return getNametag(student).length
}

// Creates a pair of students
fun StudentPair(first: Student, second: Student): Student {
    val firstLength = getCardLength(first)
    val secondLength = getCardLength(second)
    if (firstLength > secondLength) {
        return first
    }
    else if (firstLength < secondLength) {
        return second
    }
    else {
        println("${first.fore} and ${second.fore}'s names have the same length of $firstLength.")
        return first
    }
}

@EnabledTest
fun testStudentPair(): Unit {
    val harry = Student("Harry", "James", "Potter")
    val hermione = Student("Hermione", "Jean", "Granger")
    val ron = Student("Ron", "Bilius", "Weasley")

    testSame(StudentPair(harry, hermione), 22, "Checking if the program properly returns the length of Hermione's full name as 22 over Harry's")
    testSame(StudentPair(ron, harry), 19, "Checking if the program properly returns that Harry's full name has the same length as Ron's")
}

// Runs the program
fun main() {
    /* Let's create some student cards */
    val harry = Student("Harry", "James", "Potter")
    val hermione = Student("Hermione", "Jean", "Granger")
    val ron = Student("Ron", "Bilius", "Weasley")
    /* Let's create the first pair of students */
    val thePair = StudentPair(harry, hermione)
    println(getCardLength(thePair)) /* Output should be 22 */
    testStudentPair()
}

main()
