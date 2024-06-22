package org.example;

public class OneElementException extends ArithmeticException {

    OneElementException(){
        super("We can't have only 1 element in array!!!!");
    }

}
