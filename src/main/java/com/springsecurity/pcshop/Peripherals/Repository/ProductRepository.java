package com.springsecurity.pcshop.Peripherals.Repository;

import com.springsecurity.pcshop.Peripherals.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
