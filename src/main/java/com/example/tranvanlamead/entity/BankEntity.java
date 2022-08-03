package com.example.tranvanlamead.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "banks")
@NoArgsConstructor
@AllArgsConstructor
public class BankEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String symbol;
    private String stock_name;
    private double stock_price;

}
