package org.example.Client;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClientTest {
    private Address addressA = new Address("Street A", "City A",
            "Country A");
    private Address addressB = new Address("Street B", "City B",
            "Country B");
    private Client client;

    @BeforeEach
    public void setup(){
        client = new Client();
    }

    @Test
    public void afterCreationShouldHaveNoAddress(){
        assertEquals(0, client.getAddressCollection().size());
    }

    @Test
    public void shouldAllowToAddAddress() {
        client.addAddress(addressA);
        assertEquals(1, client.getAddressCollection().size());
        assertTrue(client.getAddressCollection().contains(addressA));
    }

    @Test
    public void shouldAllowToAddManyAddresses() {
        client.addAddress(addressA);
        client.addAddress(addressB);
        assertEquals(2, client.getAddressCollection().size());
        assertTrue(client.getAddressCollection().contains(addressA));
        assertTrue(client.getAddressCollection().contains(addressB));
    }

}
