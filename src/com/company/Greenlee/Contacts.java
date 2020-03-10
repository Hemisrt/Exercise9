package com.company.Greenlee;

abstract class Contacts {
    private String name;

    Contacts(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public void contact();
}
