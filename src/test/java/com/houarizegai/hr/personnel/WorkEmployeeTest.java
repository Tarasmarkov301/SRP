package com.houarizegai.hr.personnel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorkEmployeeTest {

    WorkEmployee workEmployee;
    @Before
    public void setUp() throws Exception {
        workEmployee = new WorkEmployee(new Intern("Taras Markov",100,15));
    }

    @Test
    public void getEmail() {
      String result = workEmployee.getEmail();
        assertEquals("field wasn't retrieved properly", result, "Taras.Markov@globomanticshr.com");
    }

    @Test
    public void testToString() {
        String result = workEmployee.toString();
        assertEquals("field wasn't retrieved properly", result, "Taras Markov - 100");
    }

    @Test
    public void getFullName() {
        String result = workEmployee.getFullName();
        assertEquals("field wasn't retrieved properly", result, "Taras Markov");
    }
}