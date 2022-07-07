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

        System.out.println(" Valid Emails ");

        String email = "abc@bridgelabz.co.in";
        checkValidEmail(email);

        email = "abc@gmail.com.com";
        checkValidEmail(email);

        email = "abc@yahoo.com";
        checkValidEmail(email);

        email = "abc@1.com";
        checkValidEmail(email);

        System.out.println(" Invalid Emails ");

        email = ".abc@abc.com";
        checkValidEmail(email);

        email = "abc";
        checkValidEmail(email);

        email = "abc@.com.my";
        checkValidEmail(email);

        email = "abc@abc@gmail.com";
        checkValidEmail(email);

    }

    }
