package com.houarizegai.hr.personnel;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {


    @Test
    public void getFirstName() {
        final Employee test = new FullTimeEmployee("Taras Markov", 100);

        final String result = test.getFirstName();

        assertEquals("field wasn't retrieved properly", result, "Taras");
    }

    @Test
    public void getLastName() {
        final Employee test = new FullTimeEmployee("Taras Markov", 100);

        final String result = test.getLastName();

        assertEquals("field wasn't retrieved properly", result, "Markov");
    }

    @Test
    public void getMonthlyIncome() {
        final Employee test = new FullTimeEmployee("Taras Markov", 100);

        final int result = test.getMonthlyIncome();

        assertEquals("field wasn't retrieved properly", result, 100);
    }

    @Test
    public void setMonthlyIncome() {
        final Employee test = new FullTimeEmployee("Taras Markov", 100);
        test.setMonthlyIncome(34);
        final int result = test.getMonthlyIncome();

        assertEquals("field wasn't retrieved properly", result, 34);
    }

    @Test
    public void getNbHoursPerWeek() {
        final Employee test = new Intern("Taras Markov", 100,34);
        final int result = test.getNbHoursPerWeek();
        assertEquals("field wasn't retrieved properly", result, 34);
    }

    @Test
    public void setNbHoursPerWeek() {
        final Employee test = new FullTimeEmployee("Taras Markov", 100);
        test.setNbHoursPerWeek(19);
        final int result = test.getNbHoursPerWeek();
        assertEquals("field wasn't retrieved properly", result, 19);
    }
}