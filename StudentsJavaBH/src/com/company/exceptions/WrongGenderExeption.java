package com.company.exceptions;

public class WrongGenderExeption extends Exception{
    public WrongGenderExeption(String massage){
        super(massage);
    }

    public WrongGenderExeption(){
        super("WrongGenderExeption");
    }
}
