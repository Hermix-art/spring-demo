package com.epam.training;

/**
 * @author Herman Kulik
 */
public class Client {
    String id;
    String fullName;

    public Client(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }
}
