
   /**
     * 
     */

public class Main {
    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
        DataManager dataManager = new DataManager();
        
        Employee employee = new Employee("Pavel Moravec","Java Developer","Java Developer","0","774 442 324","334 432 324f","pavel.moravec@vITStep.cz","IT Technology","IT","IT");
        employees.add(employee);
        
        dataManager.writeToCSV(employees);
        dataManager.readDataFromCsvFile();
    }

}
