package com.demo.spring.domain;

/**
 * Created by louieqin on 6/04/2017.
 */
public class UserSearchForm {
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    String firstname;
    String lastname;
}
