package com.spiet.hrpayroll.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Payment implements Serializable {

    private static final long serialVersionUID = 8137206141732921205L;

    private String name;

    private Double dailyIncome;

    private Integer days;

    public Double getTotal() {
        return days * dailyIncome;
    }
}
