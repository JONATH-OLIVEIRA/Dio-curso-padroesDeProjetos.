package com.example.ConceitoPadroesDeProjeto.service;


import org.springframework.stereotype.Service;

@Service
public class SingletonService {

    private static SingletonService instance;

    private SingletonService() {}

    public static SingletonService getInstance() {
        if (instance == null) {
            instance = new SingletonService();
        }
        return instance;
    }

    public String exemploMetodo() {
        return "Método de exemplo do SingletonService";
    }
}
