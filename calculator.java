import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("List of operations: add (+), subtract (-), multiply (*), or divide (/)");
        System.out.println("Note: please enter valid operation, input is cave sensitive.");
        
        System.out.print("Enter first number: ");
        double input1 = in.nextDouble();
        System.out.print("\nEnter second number: ");
        double input2 = in.nextDouble();

        System.out.println("What kind of operation would you like to use?");
        String operation = in.next();


        if(operation.equals("add")) {
            System.out.println("Output: " + add(input1, input2));
        }

        else if(operation.equals("subtract")) {
            System.out.println("Output: " + sub(input1, input2));
        }

        else if(operation.equals("multiply")) {
            System.out.println("Output: " + mult(input1, input2));
        }

        else if(operation.equals("divide")) {
            System.out.println("Output: " + div(input1, input2));
        }

        else {
            System.out.println("Invalid operation.");
        }
    }

    private static double add(double int1, double int2) {
        return int1 + int2;
    }
    private static double sub(double int1, double int2) {
        return int1 - int2;
    }
    private static double div(double int1, double int2) {
        return int1 / int2;
    }
    private static double mult(double int1, double int2) {
        return int1 * int2;
    }

}