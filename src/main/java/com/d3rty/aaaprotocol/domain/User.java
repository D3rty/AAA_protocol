package com.d3rty.aaaprotocol.domain;


public class User {
    private int id;
    private String name;
    private String login;
    private String password;
    private String salt;

    public User(int id, String name, String login, String password, String salt) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.salt = salt;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getSalt() {
        return salt;
    }
}
