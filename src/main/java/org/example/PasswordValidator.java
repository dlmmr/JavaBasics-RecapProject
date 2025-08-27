package org.example;

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
        return false; // stub für Red-Phase
    }

    public static boolean isCommonPassword(String password) {
        return false; // stub für Red-Phase
    }
}
