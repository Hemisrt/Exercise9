package com.company.Greenlee;

public class Phone extends Contacts {
    private String number;

    public Phone(String name, String number) {
        super(name);
        this.number = number;
    }

    @Override
    public void contact() {
        System.out.println("Calling " + number);
    }
}
