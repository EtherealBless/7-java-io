package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        System.out.flush();
        int prevByte = System.in.read();
        int curByte = System.in.read();

        while (curByte != -1) {
            if (prevByte == 13 && curByte == 10) {
                System.out.write(10);
                prevByte = System.in.read();

                if (prevByte == -1)
                    break;

                curByte = System.in.read();
                continue;
            } else {
                System.out.write(prevByte);
            }

            prevByte = curByte;
            curByte = System.in.read();
        }
        if (prevByte != -1) {
            System.out.write(prevByte);
        }
        System.out.flush();
    }
}