package org.example;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int counter = service.calc(200, 300);
        System.out.println(counter);

    }

}