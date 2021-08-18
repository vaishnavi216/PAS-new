package com.cognizant.pas.quotes.exception;

//import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

@SpringBootTest
class ExceptionDetailsTest {

    private ExceptionDetails details = new ExceptionDetails(LocalDateTime.now(),HttpStatus.ACCEPTED, "message");
    
    @Test
    void testMessageSetter() {
        details.setMessage("new message");
        assertEquals("new message",details.getMessage());
        
    }
    
    @Test
    void testTimeStampSetter() {
        
        LocalDateTime date = LocalDateTime.now();
        details.setTimeStamp(date);
        assertEquals(details.getTimeStamp(),date);
        
    }
    
    @Test
    void testStatus() {
        
        HttpStatus statusCode = HttpStatus.ACCEPTED;
        details.setStatus(statusCode);
        assertEquals(details.getStatus(),statusCode);
        
    }
    
    
}