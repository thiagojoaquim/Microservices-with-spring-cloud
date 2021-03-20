package com.thiago.hrworker.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@NoArgsConstructor
@Table(name = "tb_worker")
@Entity
public class Worker implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    private Double dailyIncome;
}
