package edu.romoshi.neoflex.service;

import edu.romoshi.neoflex.entity.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationServiceTest {

    @Test
    void calculateVocationPay() {
        Employee employee = Employee.newBuilder()
                .setAvgSalaryForYear(360000)
                .setVacationDays(16)
                .build();

        CalculationService calculation = new CalculationService();
        double actual = calculation.calculateVocationPay(employee);
        assertEquals(16382.24 , actual);
    }
}