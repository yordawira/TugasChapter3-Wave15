import model.Proses
import kotlin.system.exitProcess
import utils.Roleback


class App : Roleback{

    fun app() {
        printHeader()
        readLine()?.let {
            openMenu(it)
        }
    }

    private fun printHeader() {
        println(
            """
            =========================================
            ----------- Termial:~ Termial -----------
            =========================================
            ------- GAME SUIT TERMINAL VERSION ------
            =========================================
            1. PLAYER SUIT
            2. EXIT
            =========================================
            ENTER MENU ? (1/2)
            =========================================
        """.trimIndent()
        )
    }


    private fun openMenu(menu: String) {
        when (menu) {
            "1" -> {
                val proses = Proses()
                proses.playerSuit( this)
            }

            "2" -> {
                println("EXIT")
                exitProcess(0)
            }

            else -> {
                println("No Menu Matches")
                App()
            }
        }
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            App().app()
        }
    }

    override fun sendBack(result: String) {
        print(result)
    }
}