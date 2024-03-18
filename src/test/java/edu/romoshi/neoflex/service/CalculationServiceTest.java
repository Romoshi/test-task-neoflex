package edu.romoshi.neoflex.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculationServiceTest {

    @Test
    void calculateVocationPay() {
        CalculationService calculation = new CalculationService();
        double actual = calculation.calculateVocationPay(360000, 16);
        assertEquals(16382.24 , actual);
    }
}