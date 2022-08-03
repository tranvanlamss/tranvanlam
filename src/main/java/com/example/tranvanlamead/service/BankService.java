package com.example.tranvanlamead.service;

import com.example.tranvanlamead.entity.BankEntity;

import java.util.List;

public interface BankService {
    List<BankEntity> getAll();

    List<Double> getStockPrice(String symbol);

    List<BankEntity> getStockName(String symbol);
}
