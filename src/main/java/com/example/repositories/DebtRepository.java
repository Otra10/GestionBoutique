package com.example.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.entites.Debt;

public class DebtRepository {
    private final List<Debt> debts = new ArrayList<>();

    public void createDebt(Debt debt) {
        debts.add(debt);
    }

    public List<Debt> listUnpaidDebts() {
        List<Debt> unpaidDebts = new ArrayList<>();
        for (Debt debt : debts) {
            if (debt.getRemainingAmount() > 0) {
                unpaidDebts.add(debt);
            }
        }
        return unpaidDebts;
    }
}
