package com.demo.spring.domain;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by louieqin on 6/04/2017.
 */
public class LoginForm {
    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotEmpty
    String accountname;
    @NotEmpty
    String password;
}
