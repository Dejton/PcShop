package com.springsecurity.pcshop;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @ManyToOne
//    @JoinColumn(name = "laptop_id")
//    private Laptop laptopId;
//    @ManyToOne
//    @JoinColumn(name = "pc_id")
//    private Pc pcId;
//    @ManyToOne
//    @JoinColumn(name = "peripherals_id")
//    private Peripherals peripheralsId;
//    @ManyToOne
//    @JoinColumn(name = "pc_component_id")
//    private PcComponent pcComponentId;
//    @ManyToOne
//    @JoinColumn(name = "accessories_id")
//    private Accesories accessoriesId;
}
