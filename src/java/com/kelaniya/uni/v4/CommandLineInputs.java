package com.kelaniya.uni.v4;

public class CommandLineInputs {

    private String[] args;

    //Constructor of the class
    public CommandLineInputs(String[] arguments) {
        this.args = arguments;
    }

    public String getOperator() {
        //validate the arguments
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument");
            return ""; // will change in future
        }

        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))) {
            System.out.println("Please provide the operation as an argument");
            return ""; // will change in future
        }

        return operator;

    }
}
