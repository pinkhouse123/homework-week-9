package calculate;

public class Calculator {
    public void addition(int a, int b) {//no return type with two parameter
        System.out.println(a + b);//print statement
    }

   public void subtraction(int a, int b) {//no return type with two parameter
        System.out.println(a - b);//print statement
    }

    public void division(int a, int b) {//no return type with two parameter
        System.out.println(a / b);//print statement
    }

    public void multiplication(int a, int b) {//no return type with two parameter
        System.out.println(a * b);//print statement
    }

    public void calculateResult(int a, int b, char symbol) {//no return type with three parameter

        //if else statement
        if (symbol == '+') {
            int ans = a + b;
            System.out.println("Answer is = " + ans);
        } else if (symbol == '-') {
            int ans = a - b;
            System.out.println("Answer is = " + ans);
        } else if (symbol == '/') {
            int ans = a / b;
            System.out.println("Answer is = " + ans);
        } else if (symbol == '*') {
            int ans = a * b;
            System.out.println("Answer is = " + ans);
        } else {
            System.out.println("You Select Wrong Symbol");
        }
    }
}
