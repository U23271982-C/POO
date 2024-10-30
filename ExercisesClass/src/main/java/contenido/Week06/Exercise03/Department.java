package contenido.Week06.Exercise03;

import java.util.ArrayList;

public class Department {
    private ArrayList <Employee> employees;

    public Department() {
        employees = new ArrayList<>();
    }
    public void registrerEmployees(Employee newEmployee){
        employees.add(newEmployee);
    }
}
