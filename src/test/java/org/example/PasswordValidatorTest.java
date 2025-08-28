package org.example;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void hasMinLength_hasvalidLenght() {
        //Given
        String password = "12345678";
        boolean expected = password.length() >= 8;
        //When
        boolean actual = PasswordValidator.hasMinLength(password);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    void containsDigit_containsDigit() {
        //Given
        String password = "12345678";
        boolean expected = true;
        //When
        boolean actual = PasswordValidator.containsDigit(password);
        //Then
        assertEquals(expected, actual);

    }

    @Test
    void containsUpperAndLower_containsUpperAndLower() {
        //Given
        String password = "asdF1236";
        boolean expected = true;
        //When
        boolean actual = PasswordValidator.containsUpperAndLower(password);
        //Then
        assertEquals(expected, actual);

    }

    @Test
    void isCommonPassword() {
        //Given
        String password = "WHataboutthat";
        String[] commonPasswords = {"123456", "password", "123456789", "12345678", "qwerty", "abc123", "111111", "123123", "admin", "letmein"};
        boolean expected = Arrays.asList(commonPasswords).contains(password);
        //When
        boolean actual = PasswordValidator.isCommonPassword(password);
        //Then
        assertEquals(expected, actual);
    }
}