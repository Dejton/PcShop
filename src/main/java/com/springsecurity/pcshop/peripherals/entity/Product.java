package com.springsecurity.pcshop.peripherals.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "product")
public abstract class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String producent;

    @Column(nullable = false)
    private String name;

    private int quantity;

    @Column(nullable = false)
    private float price;

    private String description;
    @JoinColumn()
    @Column(name = "category_id")
    private long categoryId;

}
