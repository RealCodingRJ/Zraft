import BasicMaths.MathFunctions
import BasicMaths.MathOperators.SelectedOperators

fun main() {

    println("Enter Commands: ")
    val input = readln();

    if (input.contains("/cmd", ignoreCase = true)) {

        val cmd = ListCommands();
        cmd.listCommands();

    }

    else if (input.contains("/Math", ignoreCase = true)) {

        val nums1: Int = BasicMaths.BasicsMath.Basic(1, 10);
        val nums2: Int = BasicMaths.BasicsMath.Basic(1, 5);

        val operator = SelectedOperators.Operator();

        println("Selected Operator: $operator")

        if (operator.equals("+")) {

            println("What is: $nums1 + $nums2")

            val input: Int = readln().toInt();

            if (input == MathFunctions.Add(nums1, nums2)) {
                println("Correct");

            } else if (input != MathFunctions.Add(nums1, nums2)) {
                println("Incorrect Answer was: ${MathFunctions.Add(nums1, nums2)}");
            }

        }
    }
}

