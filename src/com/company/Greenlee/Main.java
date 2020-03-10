package com.company.Greenlee;

public class Main {
    // Trenton Greenlee
    // 3/9/2020
    // Exercise 9
    // CSCI 1660 - Android Programming Fundamentals (Java)
    public static void main(String[] args) {
        Email email = new Email("Trenton Greenlee", "trentongreenlee@gmail.com");
        Phone phone = new Phone("Trenton Greenlee", "614-981-6680");

        email.contact();
        phone.contact();
    }
}
