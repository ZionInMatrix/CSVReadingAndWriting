package inputoutput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static final String CSV_SEPARATOR = ";";
    private static final String fileName = System.getProperty("user.dir") + "/src/Tel.csv";

    /**
     * Snazim se udelat metodu ktera bude nacitat Data from CSV file.
     */
    public void readDataFromCsvFile() {
        String line = "";
        BufferedReader br;
        List<Employee> employees = new ArrayList<>();
            try {
                br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "Windows-1250"));
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(";");
                    Employee employee = new Employee();
                    employee.setJmeno(values[0]);
                    employee.setFunkce(values[1]);
                    employee.setPopisCinnosti(values[2]);
                    employee.setCisloDveri(values[3]);
                    employee.setTelefon(values[4]);
                    employee.setMobil(values[5]);
                    employee.setEmail(values[6]);
                    employee.setOddeleni(values[7]);
                    employee.setZkratkaOdboru(values[8]);
                    employee.setNazevOdboru(values[9]);
                    employees.add(employee);
                }
                System.out.println(employees);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    /**
     * Udelal jsem metodu, ktera bude nacitat data do CSVFilu
     */

    public void writeToCSV(ArrayList<Employee> employees) {
        try {
            BufferedWriter bw = null;
            try {
                bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "Windows-1250"));
            } catch (UnsupportedEncodingException | FileNotFoundException e) {
                e.printStackTrace();
            }
            for (Employee employee : employees) {
                StringBuffer oneLine = new StringBuffer();
                oneLine.append(employee.getJmeno());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(employee.getFunkce());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(employee.getPopisCinnosti());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(employee.getCisloDveri());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(employee.getTelefon());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(employee.getMobil());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(employee.getEmail());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(employee.getOddeleni());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(employee.getZkratkaOdboru());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(employee.getNazevOdboru());
                bw.write(oneLine.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

