package com.example.core.Factory;

import com.example.data.entites.Medecin;

import com.example.data.entites.Rv;

import java.time.LocalDateTime;

public class RVFactory {
    public static Rv createRV(int id, LocalDateTime date, Medecin medecin) {
        return new Rv(id, date, medecin);
    }
}
