package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void calcTestWhenFewNumbersFinded() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTestWhenEightNumbersFinded() {
        SQRService service = new SQRService();

        int actual = service.calc(20, 300);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTestWhenOneNumbersFinded() {
        SQRService service = new SQRService();

        int actual = service.calc(2, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTestWhenTenNumbersFinded() {
        SQRService service = new SQRService();

        int actual = service.calc(8000, 12000);
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }
}
