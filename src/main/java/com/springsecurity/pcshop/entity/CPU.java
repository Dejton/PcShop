package com.springsecurity.pcshop.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "cpu")
public class CPU {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cpu_id;

    @Column(nullable = false)
    private String producent;

    @Column(nullable = false, unique = true)
    private String name;

    private int quantity;

    @Column(nullable = false)
    private int cores;

    @Column(nullable = false)
    private float baseFrequency;

    @Column(nullable = false)
    private float price;

    private String description;



}
