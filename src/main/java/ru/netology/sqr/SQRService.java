package ru.netology.sqr;

public class SQRService {
    public int calcSquare(int borderlineStart, int borderlineEnd) {
        int count = 0;
        for (int i = 1; i <= borderlineEnd; i++) {
            if (((i * i) >= borderlineStart) && ((i * i) <= borderlineEnd)) {
                count++;
            }
        }
        return count;
    }
}
