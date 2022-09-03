package model
import utils.Roleback

class Proses {
    private var result = String()

    fun playerSuit(listener: Roleback) {
        println("Input Choose Player 1 : ")
        val playerOne = readLine()!!.lowercase()
        println("Input Choose Player 2 : ")
        val playerTwo = readLine()!!.lowercase()
        println("=========================================")
        println("result : ")
        println()


        if (playerOne == (playerTwo)) {
            result = "DRAW"
        } else if (playerOne == "batu" && playerTwo == "gunting" || playerOne == "gunting" && playerTwo == "kertas" ||
            playerOne == "kertas" && playerTwo == "batu"
        ) {
            result = "Player 1 WIN!!! "
        } else if (playerTwo == "batu" && playerOne == "gunting" || playerTwo == "gunting" && playerOne == "kertas" ||
            playerTwo == "kertas" && playerOne == "batu"
        ) {
            result = "Player 2 WIN!!!"
        } else {
            result = "YOUR INPUT WRONG! PLEASE TRY AGAIN "
        }
        listener.sendBack(result)
    }
}