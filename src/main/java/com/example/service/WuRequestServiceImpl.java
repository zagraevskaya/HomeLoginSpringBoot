package com.example.service;


import com.example.model.WuRequest;

public interface WuRequestServiceImpl {
    public WuRequest findUserByEmail(String email);
    public void saveWuRequest(WuRequest wuRequest);
}
