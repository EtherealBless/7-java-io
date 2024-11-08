package com.example.task04;

import java.io.IOException;
import java.util.List;

public class Task04Main {

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        double sum = 0;
        while (true) {
            int c = System.in.read();
            if (c == -1) {
                break;
            }
            if (c == '\n' || c == ' ') {
                if (sb.length() == 0) {
                    continue;
                }
                try {
                    sum += Double.parseDouble(sb.toString());
                } catch (Exception e) {
                    // ignore
                }
                sb = new StringBuilder();
                continue;
            }
            sb.append((char) c);
        }
        try {
            sum += Double.parseDouble(sb.toString());
        } catch (Exception e) {
            // ignore
        }
        System.out.printf("%.6f\n", sum);

    }
}
