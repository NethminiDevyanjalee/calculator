package com.kelaniya.uni.v5.input;

public class CommandLineInputs implements Inputs {

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

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul")|| operator.equals("div"))) {
            System.out.println("Please provide the operation as an argument");
            return ""; // will change in future
        }

        return operator;

    }
}
