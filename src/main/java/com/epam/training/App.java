package com.epam.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author Herman Kulik
 */
public class App {
    EventLogger eventLogger;
    Client client;

    public App(EventLogger eventLogger, Client client) {
        this.eventLogger = eventLogger;
        this.client = client;
    }

    void logEvent(String msg) {
        String message = msg.replace(client.getId(), client.getFullName());
        Event event = new Event(new Date(), null);
        event.setMsg(message);
        eventLogger.logEvent(event);
    }

    public static void main(String[] args) {
//        App app = new App();
//        app.client = new Client("1", "John Smith");
//        app.eventLogger = new ConsoleEventLogger();

//        app.logEvent("Some event for user 1");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) context.getBean("app");
        app.logEvent("hello for 1");
        app.logEvent("hello for 2");
        app.logEvent("hello for 4");
        app.logEvent("goodbye for 1");
    }
}
