package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void TestSquaring1() {
        SQRService service = new SQRService();
        int expected = 6;
        int actual = service.calcSquare(10, 99);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TestSquaring2() {
        SQRService service = new SQRService();
        int expected = 10;
        int actual = service.calcSquare(150, 500);

        Assertions.assertEquals(expected,actual);
    }
}
