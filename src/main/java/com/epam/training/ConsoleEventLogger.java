package com.epam.training;

/**
 * @author Herman Kulik
 */
public class ConsoleEventLogger implements EventLogger{
    @Override
    public void logEvent(Event message){
        System.out.println(message);
    }
}
