package BasicMaths.MathOperators;

import java.util.ArrayList;
import java.util.Random;

public class SelectedOperators {

    public static Random r = new Random();

    public static String Operator() {

        ArrayList<String> op = new ArrayList<>();

        op.add("+");
        op.add("-");
        op.add("*");
        op.add("/");

        return op.get(r.nextInt(op.size()));

    }
}
