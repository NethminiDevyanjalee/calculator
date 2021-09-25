package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class OperationFactoryTest {

    @Test
    public void should_return_Addoperation_object_when_operator_is_add(){

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("add");

        assertThat(operation, instanceOf(AddOperation.class));
    }

    @Test
    public void should_return_Suboperation_object_when_operator_is_sub(){

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("sub");

        assertThat(operation, instanceOf(SubOperation.class));
    }

    @Test
    public void should_return_Muloperation_object_when_operator_is_mul(){

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("mul");

        assertThat(operation, instanceOf(MulOperation.class));
    }

    @Test
    public void should_return_Divoperation_object_when_operator_is_div(){

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("div");

        assertThat(operation, instanceOf(DivOperation.class));
    }

}