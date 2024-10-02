import khoury.input
import khoury.testSame
import khoury.isAnInteger
import khoury.captureResults
import khoury.EnabledTest
import khoury.runEnabledTests
import khoury.reactConsole

/* Creates an enumeration with parameters */
enum class SongState {ABC, EASY_AS, BABY}

/* Creating the state variable */
var state: SongState = SongState.ABC

/* Transfers the enumeration's parameters to text */
fun stateToText(state: SongState): String {
    when (state) {
        SongState.ABC -> return "A, B, C"
        SongState.EASY_AS -> return "Easy as 1, 2, 3"
        SongState.BABY -> return "A, B, C, 1, 2, 3, baby, you and me, girl!"
    }
}
/* Plays the next state according to the conditions already satisfied */
fun nextSongState(state: SongState, input: String): SongState {
    if(input.equals("exit")) {
        return SongState.BABY
    }
    else {
        return SongState.EASY_AS
    }
}

/* Returns whether or not the current state is the final state */
fun isDone(state: SongState): Boolean {
    return state == SongState.BABY
}

/* Loops through the second state's text */
fun loop() {
    reactConsole(state, ::stateToText, ::nextSongState, ::isDone)
}

/* Runs the program */
fun main() {
    loop()
}

main()
