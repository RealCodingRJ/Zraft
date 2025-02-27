import BasicMaths.MathFunctions
import BasicMaths.MathOperators.SelectedOperators
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
}