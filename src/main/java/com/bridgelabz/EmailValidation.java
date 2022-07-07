package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void checkValidEmail(String email){

        boolean isEmail;
        String emailRegex = "^[a-zA-Z][.@a-zA-Z]*$";
        Pattern patternObject = Pattern.compile(emailRegex);
        if (email == null) {
            isEmail = false;
        }
        Matcher matcherObject = patternObject.matcher(email);
        isEmail =  matcherObject.matches();

        if(isEmail)
            System.out.println(email+" is a Valid Email address");
        else
            System.out.println(email+" is Invalid Email address");
    }

    public static void main(String[] args) {

        System.out.println(" Welcome To Email Validation Program");

        String email = "abc.xyz@bridgelabz.co.in";
        checkValidEmail(email);

        email = ".abc@abc.com";
        checkValidEmail(email);

        email = "abc@gmail.com.com";
        checkValidEmail(email);
    }
    }
