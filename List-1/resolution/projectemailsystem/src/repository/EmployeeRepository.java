package repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import business.Employee;

public class EmployeeRepository {

    private HashMap<String, Employee> employees;

    private static EmployeeRepository instance;

    private EmployeeRepository() {
        employees = new HashMap<>();
    }

    public Employee getByCode(String code) {
        return employees.get(code);
    }

    public void insert(String code, Employee employee) {
        employees.put(code, employee);
    }

    public List<Employee> getAll() {

        ArrayList<Employee> e = new ArrayList<>(employees.values());
        e.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getCode().compareTo(e2.getCode());
            }
        });

        return e;
    }

    public static EmployeeRepository getInstance() {
        if (instance == null)
            instance = new EmployeeRepository();

        return instance;
    }

}
