package com.home.dashboard.service;

import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public String saveUser(String userName,String password) {
       if(userName !=null) {
           return "Suceess";
       }else {
           return "Failed";
       }
    }
}
