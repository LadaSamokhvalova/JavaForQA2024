package ru.shop.exception;

public class BadOrderCountException extends RuntimeException{
    public BadOrderCountException(long count){
        super("Order count must be positive: " + count);
    }
}
