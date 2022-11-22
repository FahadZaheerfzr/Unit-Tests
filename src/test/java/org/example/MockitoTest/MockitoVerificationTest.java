package org.example.MockitoTest;

import org.example.Mockito.Car;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MockitoVerificationTest {

    private Car myFerrari = mock(Car.class);

    // This test will pass
    @Test
    public void verificationTest(){
        myFerrari.driveTo("Sweet home Islamabad");
        myFerrari.needsFuel();

        verify(myFerrari).driveTo("Sweet home Islamabad");
        verify(myFerrari).needsFuel();
    }

    // This test will fail
    @Test
    public void verificationTestFailure(){
        myFerrari.needsFuel();
        verify(myFerrari).getEngineTemperature();
    }

    // This test will fail since the arguments are different
    @Test
    public void verificationFailureArguments(){
        myFerrari.driveTo("Sweet Home Islamabad");
        verify(myFerrari).driveTo("NUST H-12");
    }
}
