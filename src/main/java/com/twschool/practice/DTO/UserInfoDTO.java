package com.twschool.practice.DTO;

import org.springframework.stereotype.Component;

@Component
public class UserInfoDTO {
    private  String user;
    private int integral;
    private String result;

    public UserInfoDTO(String user, int integral, String result) {
        this.user = user;
        this.integral = integral;
        this.result = result;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
