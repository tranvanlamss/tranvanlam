package com.example.tranvanlamead.service;

import com.example.tranvanlamead.entity.BankEntity;
import com.example.tranvanlamead.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService{
    @Autowired
    BankRepository bankRepository;

    @Override
    public List<BankEntity> getAll() {
        return bankRepository.findAll();
    }

    @Override
    public List<Double> getStockPrice(String symbol) {

        return bankRepository.findByStockPrice(symbol);
    }

    @Override
    public List<BankEntity> getStockName(String symbol) {
        return bankRepository.findByStockName(symbol);
    }

}
