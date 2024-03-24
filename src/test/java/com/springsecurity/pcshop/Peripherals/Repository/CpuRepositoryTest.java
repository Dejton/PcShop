package com.springsecurity.pcshop.Peripherals.Repository;

import com.springsecurity.pcshop.Peripherals.Entity.Cpu;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class CpuRepositoryTest {
    @Autowired
    private CpuRepository cpuRepository;

    private Cpu cpu;

    @BeforeEach
    void setUp() {


    }
}