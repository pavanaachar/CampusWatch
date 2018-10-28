package com.example.pavana.campuswatch;

public class User {
    private String username;
    private String email;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String un)
    {
        username = un;
    }

    public void setEmail(String em)
    {
        email = em;
    }
}
