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
public class Ram extends Product {
    @Column(nullable = false)
    private int size;
    private int ddr;
}
