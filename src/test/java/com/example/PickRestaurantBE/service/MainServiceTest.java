package com.example.PickRestaurantBE.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class MainServiceTest {

    @InjectMocks
    private MainService service;

    @Test
    public void getMainServiceReturnString() {
        String actual = service.getMainService();
        assertEquals("Greetings from Spring Boot!", actual);
    }
}