package session11.user_service;

import java.time.LocalDateTime;

public class User {

    private String firstName;
    private String lastName;
    private LocalDateTime createdAt;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}