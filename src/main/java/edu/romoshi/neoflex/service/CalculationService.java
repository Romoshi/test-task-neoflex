package edu.romoshi.neoflex.service;

import edu.romoshi.neoflex.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {
    private final double AVG_DAYS_MONTH = 29.3;
    private final int MONTHS_WORKED = 12;
    private final double DAYS_WORKED = MONTHS_WORKED * AVG_DAYS_MONTH;

    public double calculateVocationPay(Employee employee) {
        double averageDailyEarnings = employee.getAvgSalaryForYear() / DAYS_WORKED;
        return  (Math.round(averageDailyEarnings * 100.0) / 100.0) * employee.getVacationDays();
    }
}
