package com.thiago.hrpayroll.entities;

import lombok.*;
import java.io.Serializable;

@Data
public class Worker implements Serializable {
    private Long id;
    private  String name;
    private Double dailyIncome;
}
