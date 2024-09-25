package com.example.services;

import java.time.LocalDateTime;
import java.util.List;

import com.example.data.entites.Medecin;
import com.example.data.entites.Rv;
import com.example.data.repositories.bd.RVRepository;

public class RVService {
    private final RVRepository rvRepository;

    public RVService(RVRepository rvRepository) {
        this.rvRepository = rvRepository;
    }

    public void createRV(int id, LocalDateTime date, Medecin medecin) {
        Rv rv = new Rv(id, date, medecin);
        rvRepository.save(rv);
    }

    public List<Rv> listAllRV() {
        return rvRepository.findAll();
    }

    public List<Rv> filterRVByDate(LocalDateTime date) {
        return rvRepository.findByDate(date);
    }
}
