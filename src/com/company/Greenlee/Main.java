package com.company.Greenlee;

public class Main {
    // Trenton Greenlee
    // 3/9/2020
    // Exercise 9
    // CSCI 1660 - Android Programming Fundamentals (Java)
    public static void main(String[] args) {
        Email email = new Email("Naruto", "nuzumaki@gmail.com");
        Phone phone = new Phone("Naruto", "614-342-6544");

        email.contact();
        phone.contact();
    }
}
