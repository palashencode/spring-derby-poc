package com.java.spring.starterjdbc.service.impl;

import com.java.spring.starterjdbc.service.SampleClient;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("a")
public class SampleClientImplA implements SampleClient{

    @Override
    public String getValue() {
        return "SampleClientImplA was called.";
    }
    
}
