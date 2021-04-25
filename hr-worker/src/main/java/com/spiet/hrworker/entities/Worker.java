package com.spiet.hrworker.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@EqualsAndHashCode
@Entity
@Table(name = "tb_worker")
@AllArgsConstructor
@NoArgsConstructor
public class Worker implements Serializable {

    private static final long serialVersionUID = -3103601001837716254L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double dailyIncome;
}
