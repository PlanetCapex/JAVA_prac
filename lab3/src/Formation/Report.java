package Formation;

import java.util.ArrayList;

public class Report {

    public Report() {
    }

    public static void generateReport(ArrayList<Employee> employees){
        System.out.println("Отчет о сотрудниках");
        for (Employee employee: employees){
            System.out.printf("\n%-50s Имя сотрудника - %s\n%-50s Зарплата сотрудника -  %.2f руб.", " ", employee.getFullname(), " ", employee.getSalary());

        }
        System.out.println();
    }
}
