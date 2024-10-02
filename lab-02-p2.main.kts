import khoury.input
import khoury.testSame
import khoury.isAnInteger
import khoury.captureResults
import khoury.CapturedResult
import khoury.EnabledTest
import khoury.runEnabledTests

/* Error messages */
val nan = "Invalid input: input is not a number."
val nir = "Invalid input: input is not in range."

/* Alarm responses */
val early = "Slow your horses, Early Bird!"
val late = "A nice time to sleep in!"

/* User input */
val prompt = "Input when you would like to wake up in the morning between 1am and 11am: "

/* Returns an alarm response based on a user's input */
fun wakeupTime(): Unit {
    println(prompt)
    val time = input().toIntOrNull()
    if (time == null) {
        println(nan)
    }
    else if (time >= 1 && time <= 7) {
        println(early)
    }
    else if (time >= 8 && time <= 11) {
        println(late)
    }
    else {
        println(nir)
    }
}

@EnabledTest
fun testWakeupTime() {
    /**
    * Helper function to test what is typed at
    * the console against the expected output.
    */
    fun _test(cin: String, cout: String) {
        testSame(
            captureResults(::wakeupTime, cin),
            CapturedResult(
                Unit,
                prompt,
                cout,
            ),
            cin
        )
    }
    _test("Howdy!", nan)
    _test("0", nir)
    _test("12", nir)
    _test("5", early)
    _test("8", late)
    _test("11", late)
}

/* Runs the program */
fun main() {
    testWakeupTime()
}

main()
