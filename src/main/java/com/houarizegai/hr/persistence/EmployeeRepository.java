package com.houarizegai.hr.persistence;

import com.houarizegai.hr.personnel.Employee;
import com.houarizegai.hr.personnel.FullTimeEmployee;
import com.houarizegai.hr.personnel.PartTimeEmployee;
import com.houarizegai.hr.personnel.WorkEmployee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/*
Helper method to perform CRUD operations on employees. In a production
application we could use the database for persistence. In this demo,
we are storing employees in the file system.
 */

public class EmployeeRepository {

    private EmployeeFileSerializer fileSerializer;

    public EmployeeRepository(EmployeeFileSerializer fileSerializer) {
        this.fileSerializer = fileSerializer;
    }

    public void save(Employee employee) throws IOException {//
        StringBuilder serializedString = fileSerializer.serialize(employee);

        Path path = Paths.get(new WorkEmployee(employee).getFullName()
                .replace(" ", "_") + ".rec");
        Files.write(path, serializedString.toString().getBytes());
    }
}
