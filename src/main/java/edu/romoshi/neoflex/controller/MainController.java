package edu.romoshi.neoflex.controller;

import edu.romoshi.neoflex.entity.Employee;
import edu.romoshi.neoflex.service.CalculationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final CalculationService calculationService;

    public MainController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping("/calculate")
    public ResponseEntity<Double> getCalculate(@RequestParam double salary,
                               @RequestParam int days) {
        Employee employee = Employee.newBuilder()
                .setAvgSalaryForYear(salary)
                .setVacationDays(days)
                .build();
        double result = calculationService.calculateVocationPay(employee);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
