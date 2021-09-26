package com.kelaniya.uni.v5.input;

public class CommandLineInputs implements Inputs {

    private String[] args;

    //Constructor of the class
    public CommandLineInputs(String[] arguments) {
        this.args = arguments;
    }

    public String getOperator() throws InvaidInputException {
        //validate the arguments
        if (args.length == 0) {
            throw new InvaidInputException("Please provide the operation as an argument");
        }

        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul")|| operator.equals("div"))) {
            throw new InvaidInputException("Please provide the operation as an argument");
        }

        return operator;

    }
}
