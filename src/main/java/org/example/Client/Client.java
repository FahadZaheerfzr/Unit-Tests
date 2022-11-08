package org.example.Client;

import java.util.ArrayList;

public class Client {
    private int id;
    private String name;
    private ArrayList<Address> addressCollection;

    public Client(){
        this.id = 19;
        this.name="Fahad Zaheer";
        addressCollection = new ArrayList<Address>();
    }

    public Client(int id, String name, ArrayList<Address> addressCollection) {
        this.id = id;
        this.name = name;
        this.addressCollection = addressCollection;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Address> getAddressCollection() {
        return addressCollection;
    }

    public void addAddress(Address address){
        addressCollection.add(address);
    }
}
