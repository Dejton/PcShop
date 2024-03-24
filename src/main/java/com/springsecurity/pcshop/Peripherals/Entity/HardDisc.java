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
//klasa Patryka
public class HardDisc extends Product {
    @Column(name = "memory_type", nullable = false)
    private String memoryType;
    @Column(name = "disc_capacity", nullable = false)
    private int diskCapacity;
}
