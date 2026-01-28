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

    public double devide(double num1, double num2){
        if(num2 == 0){
            System.out.println("Делить на ноль нельзя!");
            return Double.NaN;
        }
        return num1 / num2;
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