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
public class GraphicCard extends Product {
    @Column(nullable = false)
    private String brand;
    @Column(nullable = false)
    private int memory;
    @Column(name = "memory_type", nullable = false)
    private String memoryType;
}
