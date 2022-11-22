package org.example.MockitoTest;

import org.example.Mockito.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MockitoTest {
    private Car myFerrari = mock(Car.class);

    @Test
    public void testIfFerrariIsACar(){
        assertTrue(myFerrari instanceof Car);
    }

    @Test
    public void testDefaultBehaviorOfTestDouble(){
        assertFalse(myFerrari.needsFuel(), "New test boolean should return false");
        assertEquals(myFerrari.getEngineTemperature(), 0.0, "New test double should return 0.0 as double");
    }

    @Test
    public void testStubbing(){
        assertFalse(myFerrari.needsFuel(), "New test boolean should return false");

        when(myFerrari.needsFuel()).thenReturn(true);

        assertTrue(myFerrari.needsFuel(), "After being instructed the boolean should return what we want");
    }

    @Test
    public void throwRuntimeException(){
        when(myFerrari.needsFuel()).thenThrow(new RuntimeException());
        assertThrows(RuntimeException.class, ()-> {
           myFerrari.needsFuel();
        });
    }
}
