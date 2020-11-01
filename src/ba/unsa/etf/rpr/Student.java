package ba.unsa.etf.rpr;

import java.util.Date;

public class Student implements Osoba {
    private String ime;
    private int brojIndeksa;
    private Date datumRodjenja;

    public Student(String ime, int brojIndeksa) {
        this.ime = ime;
        this.brojIndeksa = brojIndeksa;
        System.out.println("konstruktor student");
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public void ispisi () {
        System.out.println("Student: " + ime + " (" + brojIndeksa + ")");
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }
}
