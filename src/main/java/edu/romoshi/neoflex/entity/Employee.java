package edu.romoshi.neoflex.entity;

public class Employee {

    private double avgSalaryForYear;
    private int vacationDays;

    private Employee() {
    }

    public double getAvgSalaryForYear() {
        return avgSalaryForYear;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public static Builder newBuilder() {
        return new Employee().new Builder();
    }

    public class Builder {

        private Builder()  {
        }

        public Builder setAvgSalaryForYear(double avgSalaryForYear) {
            Employee.this.avgSalaryForYear = avgSalaryForYear;
            return this;
        }

        public Builder setVacationDays(int vacationDays) {
            Employee.this.vacationDays = vacationDays;
            return this;
        }

        public Employee build() {
            return Employee.this;
        }
    }
}
