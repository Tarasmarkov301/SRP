package com.houarizegai.hr.personnel;

public class WorkEmployee {
    Employee employee;
    public WorkEmployee(Employee employee) {
        this.employee = employee;
    }
        public String getEmail() {
            return this.employee.getFirstName() + "." +
                    this.employee.getLastName() +
                    "@globomanticshr.com";
        }

        @Override
        public String toString() {
            return this.employee.getFirstName() + " " +
                    this.employee.getLastName() + " - " +
                    this.employee.getMonthlyIncome();
        }
        public String getFullName() {
            return this.employee.getFirstName() + " " + this.employee.getLastName();
        }
    }

