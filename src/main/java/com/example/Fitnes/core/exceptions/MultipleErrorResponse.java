package com.example.Fitnes.core.exceptions;

import java.util.List;

public class MultipleErrorResponse extends Exception{
    private String logref;
    List<MyException> errors;
}
