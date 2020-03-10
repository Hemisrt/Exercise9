package com.company.Greenlee;

public class Email extends Contacts {
    private String email;

    public Email(java.lang.String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public void contact() {
        System.out.println("Emailing " + email);
    }
}
