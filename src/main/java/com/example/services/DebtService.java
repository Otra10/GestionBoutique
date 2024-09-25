package com.example.services;

import java.util.Date;
import java.util.List;

import com.example.entites.Debt;
import com.example.repositories.DebtRepository;
import com.example.services.interfaces.IDebtService;

public class DebtService implements IDebtService {
    private final DebtRepository debtRepository;

    public DebtService(DebtRepository debtRepository) {
        this.debtRepository = debtRepository;
    }

    @Override
    public void createDebt(Date date, double amount, double amountPaid, double remainingAmount) {
        Debt debt = new Debt(date, amount, amountPaid, remainingAmount, null);
        debtRepository.createDebt(debt);
    }

    @Override
    public List<Debt> listUnpaidDebts() {
        return debtRepository.listUnpaidDebts();
    }
}
