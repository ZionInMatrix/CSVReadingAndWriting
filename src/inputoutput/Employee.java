package inputoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Employee implements Serializable {
    private String jmeno;
    private String funkce;
    private String popisCinnosti;
    private String cisloDveri;
    private int telefon;
    private int mobil;
    private String email;
    private String oddeleni;
    private String zkratkaOdboru;
    private String nazevOdboru;

    List<Employee> employeeList = new ArrayList<>();


    public Employee(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Employee(String jmeno) {
        this.jmeno = jmeno;
    }

    public Employee(String jmeno, String funkce) {
        this.jmeno = jmeno;
        this.funkce = funkce;
    }

    public Employee(String jmeno, String funkce, String popisCinnosti) {
        this.jmeno = jmeno;
        this.funkce = funkce;
        this.popisCinnosti = popisCinnosti;
    }

    public Employee(String jmeno, String funkce, String popisCinnosti, String cisloDveri) {
        this.jmeno = jmeno;
        this.funkce = funkce;
        this.popisCinnosti = popisCinnosti;
        this.cisloDveri = cisloDveri;
    }

    public Employee(String jmeno, String funkce, String popisCinnosti, String cisloDveri, int telefon) {
        this.jmeno = jmeno;
        this.funkce = funkce;
        this.popisCinnosti = popisCinnosti;
        this.cisloDveri = cisloDveri;
        this.telefon = telefon;
    }

    public Employee(String jmeno, String funkce, String popisCinnosti, String cisloDveri, int telefon, int mobil) {
        this.jmeno = jmeno;
        this.funkce = funkce;
        this.popisCinnosti = popisCinnosti;
        this.cisloDveri = cisloDveri;
        this.telefon = telefon;
        this.mobil = mobil;
    }

    public Employee(String jmeno, String funkce, String popisCinnosti, String cisloDveri, int telefon, int mobil, String email) {
        this.jmeno = jmeno;
        this.funkce = funkce;
        this.popisCinnosti = popisCinnosti;
        this.cisloDveri = cisloDveri;
        this.telefon = telefon;
        this.mobil = mobil;
        this.email = email;
    }

    public Employee(String jmeno, String funkce, String popisCinnosti, String cisloDveri, int telefon, int mobil, String email, String oddeleni) {
        this.jmeno = jmeno;
        this.funkce = funkce;
        this.popisCinnosti = popisCinnosti;
        this.cisloDveri = cisloDveri;
        this.telefon = telefon;
        this.mobil = mobil;
        this.email = email;
        this.oddeleni = oddeleni;
    }

    public Employee(String jmeno, String funkce, String popisCinnosti, String cisloDveri, int telefon, int mobil, String email, String oddeleni, String zkratkaOdboru) {
        this.jmeno = jmeno;
        this.funkce = funkce;
        this.popisCinnosti = popisCinnosti;
        this.cisloDveri = cisloDveri;
        this.telefon = telefon;
        this.mobil = mobil;
        this.email = email;
        this.oddeleni = oddeleni;
        this.zkratkaOdboru = zkratkaOdboru;
    }

    public Employee(String jmeno, String funkce, String popisCinnosti, String cisloDveri, int telefon, int mobil, String email, String oddeleni, String zkratkaOdboru, String nazevOdboru) {
        this.jmeno = jmeno;
        this.funkce = funkce;
        this.popisCinnosti = popisCinnosti;
        this.cisloDveri = cisloDveri;
        this.telefon = telefon;
        this.mobil = mobil;
        this.email = email;
        this.oddeleni = oddeleni;
        this.zkratkaOdboru = zkratkaOdboru;
        this.nazevOdboru = nazevOdboru;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getFunkce() {
        return funkce;
    }

    public void setFunkce(String funkce) {
        this.funkce = funkce;
    }

    public String getPopisCinnosti() {
        return popisCinnosti;
    }

    public void setPopisCinnosti(String popisCinnosti) {
        this.popisCinnosti = popisCinnosti;
    }

    public String getCisloDveri() {
        return cisloDveri;
    }

    public void setCisloDveri(String cisloDveri) {
        this.cisloDveri = cisloDveri;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public int getMobil() {
        return mobil;
    }

    public void setMobil(int mobil) {
        this.mobil = mobil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOddeleni() {
        return oddeleni;
    }

    public void setOddeleni(String oddeleni) {
        this.oddeleni = oddeleni;
    }

    public String getZkratkaOdboru() {
        return zkratkaOdboru;
    }

    public void setZkratkaOdboru(String zkratkaOdboru) {
        this.zkratkaOdboru = zkratkaOdboru;
    }

    public String getNazevOdboru() {
        return nazevOdboru;
    }

    public void setNazevOdboru(String nazevOdboru) {
        this.nazevOdboru = nazevOdboru;
    }
}

