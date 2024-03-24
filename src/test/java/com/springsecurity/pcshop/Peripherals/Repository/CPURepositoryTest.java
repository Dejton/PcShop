package com.springsecurity.pcshop.Peripherals.Repository;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class CPURepositoryTest {
    @Autowired
    private CpuRepository cpuRepository;

    private com.springsecurity.pcshop.Peripherals.Entity.CPU cpu;

    @BeforeEach
    void setUp() {


    }
}