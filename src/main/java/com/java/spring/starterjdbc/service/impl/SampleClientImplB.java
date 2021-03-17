package com.java.spring.starterjdbc.service.impl;

import com.java.spring.starterjdbc.service.SampleClient;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("b")
public class SampleClientImplB implements SampleClient {

    @Override
    public String getValue() {
        return "SampleClientImplB called";
    }
    
}
