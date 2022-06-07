package inputoutput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataManager {

    private static final String CSV_SEPARATOR = ";";
    private static final String fileName = System.getProperty("user.dir") + "/src/Tel.csv";

    public List<Employee> readDataFromCsvFile() {

        String line;
        BufferedReader reader;
        List<Employee> employees = new ArrayList<>();
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "Windows-1250"));
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(CSV_SEPARATOR);
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

        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public void writeToCSV(List<Employee> employees) {

        try {
            BufferedWriter bw = null;

            System.out.println();
            System.out.println();
            System.out.println("Zapisuji do souboru " + fileName);
            System.out.println();
            System.out.println();

            try {
                bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName, true), "Windows-1250"));
            } catch (UnsupportedEncodingException | FileNotFoundException e) {
                e.printStackTrace();
            }

            for (Employee employee : employees) {
                String data = employee.getJmeno() +
                        CSV_SEPARATOR +
                        employee.getFunkce() +
                        CSV_SEPARATOR +
                        employee.getPopisCinnosti() +
                        CSV_SEPARATOR +
                        employee.getCisloDveri() +
                        CSV_SEPARATOR +
                        employee.getTelefon() +
                        CSV_SEPARATOR +
                        employee.getMobil() +
                        CSV_SEPARATOR +
                        employee.getEmail() +
                        CSV_SEPARATOR +
                        employee.getOddeleni() +
                        CSV_SEPARATOR +
                        employee.getZkratkaOdboru() +
                        CSV_SEPARATOR +
                        employee.getNazevOdboru();
                bw.write(data);
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


