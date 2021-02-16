import inputoutput.Employee;
import inputoutput.DataManager;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        DataManager dataManager = new DataManager();

        List<Employee> employees = dataManager.readDataFromCsvFile();

        System.out.println("-------------  Puvodni soubor ------------------");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        Employee employee = new Employee("Pavel Moravec","Java Developer","Java Developer","0","774 442 324","334 432 324f","pavel.moravec@vITStep.cz","IT Technology","IT","IT");

        List<Employee> employeesToAppend = new ArrayList();
        employeesToAppend.add(employee);

        dataManager.writeToCSV(employeesToAppend);

        List<Employee> employees2 = dataManager.readDataFromCsvFile();

        System.out.println("-------------  Po pridani zaznamu ------------------");
        for (int i = 0; i < employees2.size(); i++) {
            System.out.println(employees2.get(i));
        }

    }

}
