public class Calculator {

    public double sum(double num1, double num2){
        return num1 + num2;
    }

    public double subtract(double num1, double num2){
        return num1 - num2;
    }

    public double multiply(double num1, double num2){
        return num1 * num2;
    }

    public double devide(double number1, double number2){
        if(number2 == 0){
            System.out.println("Невозможно поделить на ноль!");
            return Double.NaN;
        }
        return number1 / number2;
    }

    public int factorial(int num){
        if(num == 0){
            return 1;
        }
        else{
            return num * factorial(num - 1);
        }
    }

}