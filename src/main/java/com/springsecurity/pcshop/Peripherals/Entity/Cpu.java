package com.springsecurity.pcshop.Peripherals.Entity;

import com.springsecurity.pcshop.Peripherals.Entity.Product;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cpu extends Product {
    @Column(nullable = false)
    private int core;
    @Column(name = "base_frequency", nullable = false)
    private float baseFrequency;
}
