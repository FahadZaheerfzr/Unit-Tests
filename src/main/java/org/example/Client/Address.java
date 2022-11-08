package org.example.Client;

public class Address {
    private String streetAddress;
    private String city;
    private String country;


    public Address(String streetAddress, String city, String country) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.country = country;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
