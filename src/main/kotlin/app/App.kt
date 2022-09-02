package app

import model.Proses

class App {

    private val proses: MutableList<Proses> = mutableListOf()

    private fun printHeader(){
        println("~~~~~~~~~~~~~ Terminal :~Terminal ~~~~~~~~~~~~~~~")
        println("=================================================")

    }

    private fun inputScore(){
        println("~~~~~~~~~~ Game Suit Terminal Version ~~~~~~~~~~~")
        println("=================================================")
            println("1.Masukan Pemain 1 :  ")

            println("1.Masukan Pemain 2 :  ")

            println("Hasil : $")
    }
    private fun printOutput(){

    }

    fun run(){
        printHeader()
        inputScore()
    }

    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            App().run()
        }
    }
}
