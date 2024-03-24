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
public class Motherboard extends Product {
    @Column(nullable = false)
    private String socket;
    @Column(name = "memory_type", nullable = false)
    private String memoryType;
}
