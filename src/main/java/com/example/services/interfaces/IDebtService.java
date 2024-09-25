package com.example.services.interfaces;

import java.util.Date;
import java.util.List;

import com.example.entites.Debt;

public interface IDebtService {
    void createDebt(Date date, double amount, double amountPaid, double remainingAmount);
    List<Debt> listUnpaidDebts();
}
