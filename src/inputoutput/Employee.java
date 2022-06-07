package inputoutput;

import java.io.Serializable;

public class Employee implements Serializable {

    private String jmeno;
    private String funkce;
    private String popisCinnosti;
    private String cisloDveri;
    private String telefon;
    private String mobil;
    private String email;
    private String oddeleni;
    private String zkratkaOdboru;
    private String nazevOdboru;

    public Employee() {
    }

    public Employee(String jmeno, String funkce, String popisCinnosti, String cisloDveri, String telefon, String mobil, String email, String oddeleni, String zkratkaOdboru, String nazevOdboru) {
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

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
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

    @Override
    public String toString() {
        return "Employee{" +
                "jmeno='" + jmeno + '\'' +
                ", funkce='" + funkce + '\'' +
                ", popisCinnosti='" + popisCinnosti + '\'' +
                ", cisloDveri='" + cisloDveri + '\'' +
                ", telefon='" + telefon + '\'' +
                ", mobil='" + mobil + '\'' +
                ", email='" + email + '\'' +
                ", oddeleni='" + oddeleni + '\'' +
                ", zkratkaOdboru='" + zkratkaOdboru + '\'' +
                ", nazevOdboru='" + nazevOdboru + '\'' +
                '}';
    }
}


