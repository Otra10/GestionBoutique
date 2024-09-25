package com.example.data.repositories.bd;


import com.example.data.entites.Rv;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RVRepository {
    private List<Rv> rendezVousList = new ArrayList<>();

    public void save(Rv rv) {
        rendezVousList.add(rv);
    }

    public List<Rv> findAll() {
        return rendezVousList;
    }

    // Filtrer les RV par date
    public List<Rv> findByDate(LocalDateTime date) {
        return rendezVousList.stream()
            .filter(rv -> rv.getDate().toLocalDate().equals(date.toLocalDate()))
            .collect(Collectors.toList());
    }
}
