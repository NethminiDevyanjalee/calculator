package com.kelaniya.uni;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] inputs= ReadFile.read("numbers.txt");
        double num1 =Double.parseDouble( inputs[0]);
        double num2 =Double.parseDouble( inputs[1]);
        System.out.println("Enter the operation:(add,sub,mul)");
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.nextLine();
        switch(operator){
            case "add":
                System.out.println(Operation.add(num1,num2));
                break;

            case "sub":
                System.out.println(Operation.sub(num1,num2));
                break;

            case "mul":
                System.out.println(Operation.mul(num1,num2));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
