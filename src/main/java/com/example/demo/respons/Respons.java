package com.example.demo.respons;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Respons<T> {
    private String service;
    private String message;
    private T data;
}
