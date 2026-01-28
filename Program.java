import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        List<Double> results = new ArrayList<>();

        System.out.println("Введите операцию для вычисления: ");
        String sign = scan.nextLine();

        System.out.println("Введите первое число: ");
        double num1 = Double.parseDouble(scan.nextLine());

        System.out.println("Введите второе число: ");
        double num2 = Double.parseDouble(scan.nextLine());
        double result = 0;
        switch(sign){
            case "+":
                result = calculator.sum(num1, num2);
                System.out.println(num1 + " + " + num2 + " = " + result);
                results.add(result);
                break;
            case "-":
                result = calculator.subtract(num1, num2);
                System.out.println(num1 + " - " + num2 + " = " + result);
                results.add(result);
                break;
            case "*":
                result = calculator.multiply(num1, num2);
                System.out.println(num1 + " * " + num2 + " = " + result);
                results.add(result);
                break;
            case "/":
                result = calculator.devide(num1, num2);
                System.out.println(num1 + " / " + num2 + " = " + result);
                results.add(result);
                break;
        }

        System.out.println("Хотите вычислить факториал? ");
        System.out.println("1. Да");
        System.out.println("2. Нет");
        int question = scan.nextInt();

        if(question == 1){
            System.out.println("Введите число для вычисления факториала: ");
            int num = scan.nextInt();
            System.out.println("Факториал числа " + num + " = " + calculator.factorial(num));
        }
        else{
            System.exit(0);
        }
    }
}