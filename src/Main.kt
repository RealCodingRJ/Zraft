import BasicMaths.MathFunctions
import BasicMaths.MathOperators.SelectedOperators
import Hex.Hex
import ListedWords.WordsList
import java.util.Scanner

fun main() {

    val scan =  Scanner(System.`in`);
    println("Enter Commands: ");

    val command = scan.nextLine();

    if (command == "/Math") {

        println("Enter Type: ")
        val type = scan.nextLine();

        if (type == "Basic") {
            val operator = SelectedOperators.Operator()


            val number_1 = BasicMaths.BasicsMath.Basic(1, 10);
            val number_2 = BasicMaths.BasicsMath.Basic(1,5);

            println("Operator: $operator")

            if (operator.contains("+")) {
                println("What is: $number_1 + $number_2")

                val answer = readln().toInt();

                if (answer == MathFunctions.Add(number_1, number_2)) {
                    println("Correct")
                }
            }

            if (operator.contains("-")) {
                println("What is: $number_1 - $number_2")

                val answer = readln().toInt();

                if (answer == MathFunctions.Sub(number_1, number_2)) {
                    println("Correct")
                }
            }

            if (operator.contains("*")) {
                println("What is: $number_1 * $number_2")

                val answer = readln().toInt();

                if (answer == MathFunctions.Mul(number_1, number_2)) {
                    println("Correct")
                }
            }

            if (operator.contains("/")) {
                println("What is: $number_1 / $number_2")

                val answer = readln().toInt();

                if (answer == MathFunctions.Div(number_1, number_2)) {
                    println("Correct")
                }
            }

        }

    }

    else if (command == "/Hex"){
        println("Enter R Number: ");
        val numR = scan.nextInt();
        println("Enter G Number: ");
        val numG = scan.nextInt();
        println("Enter R Number: ");
        val numB = scan.nextInt();

        println("Hex Color Code is: #${Hex.HexCode(numR) + Hex.HexCode(numG) + Hex.HexCode(numB)}");

        println("[R]: $numR")
        println("[G]: $numG")
        println("[B]: $numB")


    }else if (command.equals("/Words")) {
        val words = WordsList.Words();
        val Word = WordsList.randomWordSelected(words);

        val inputWords = scan.nextLine();

        if (inputWords == Word) {



        }

    }

}