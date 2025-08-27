package org.example;

import java.util.Arrays;

public class PasswordValidator {

    public static void main(String[] args) {}

    public static boolean hasMinLength(String password, int min) {
        if(password!=null && password.length()>=min) {  //erst Nullcheck (Laufzeitfehler vermeiden) dann Mindestslänge
            return true;                          //Bedingungen erfüllt
        }else{
            return false;                        //Bedingungen nicht erfüllt
        }
    }

    public static boolean containsDigit(String password) {
        for (int i = 0; i < password.length(); i++) {    //for schleife initialisieren
            char ch = password.charAt(i);       // ch bekommt jeden aufeinanderfolgenden Wert in der Schleife
            if (Character.isDigit(ch)) {       // Character.isDigit(ch) prüft ob es eine Zahl ist
                return true;                   // sofort true, wenn eine Ziffer gefunden, bricht die Schleife ab
            }
        }
        return false;                         //for schleife durchgelaufen und keine Zahl gefunden
    }

    public static boolean containsUpperAndLower(String password) {
        char currentCharacter;
        boolean upperCaseFlag = false;  //Flag Wert setzen
        boolean lowerCaseFlag = false;
//        boolean onlyUpperCaseFlag = false;
//        boolean onlyLowerCaseFlag = false;
//        boolean onlyDigitFlag = false;
        for (int i = 0; i < password.length(); i++) {   //Schleife Init, jedes char vom String
            currentCharacter = password.charAt(i);
            if (Character.isUpperCase(currentCharacter)) {
                upperCaseFlag = true;
            } else if (Character.isLowerCase(currentCharacter)) {
                lowerCaseFlag = true;
            }
        }
        return upperCaseFlag && lowerCaseFlag;
    }


    public static boolean isCommonPassword(String password) {
        String[] commonPasswords = {"123456", "password", "123456789", "12345678", "qwerty", "abc123", "111111", "123123", "admin", "letmein"};
        return Arrays.asList(commonPasswords).contains(password);
    }
}
