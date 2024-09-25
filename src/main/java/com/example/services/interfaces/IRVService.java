package com.example.services.interfaces;


import com.example.data.entites.Medecin;
import com.example.data.entites.Rv;

import java.time.LocalDateTime;
import java.util.List;

public interface IRVService {
    void createRV(int id, LocalDateTime date, Medecin medecin);
    List<Rv> listAllRV();
    List<Rv> filterRVByDate(LocalDateTime date);
}
