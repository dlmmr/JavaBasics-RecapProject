package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void hasMinLength() {
        //Given
        String password = "12345678";
        int min = 8;
        boolean notNull = password != null;
        boolean expected = notNull && password.length() >= min;
        //When
        boolean actual = PasswordValidator.hasMinLength(password, min);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    void containsDigit() {
        //Given
        String password = "12345678";
        boolean expected = true;
        //When
        boolean actual = PasswordValidator.containsDigit(password);
        //Then
        assertEquals(expected, actual);

    }

    @Test
    void containsUpperAndLower() {
        //Given
        String password = "asdF1236";
        boolean expected = true;
        //When
        boolean actual = PasswordValidator.containsUpperAndLower(password);
        //Then
        assertEquals(expected, actual);

    }
}