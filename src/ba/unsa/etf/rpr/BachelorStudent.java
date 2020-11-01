package ba.unsa.etf.rpr;

import java.util.Date;

public class BachelorStudent extends Student implements Osoba, Comparable, Cloneable {

    public BachelorStudent(String ime, int brojIndeksa) {
        super(ime, brojIndeksa);
        System.out.println("konstruktor bachelorstudent");
    }

    @Override
    public void ispisi () {
        System.out.print("Bachelor ");
        super.ispisi();
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof BachelorStudent) {
            BachelorStudent bs = (BachelorStudent) o;
            if (getBrojIndeksa() > bs.getBrojIndeksa())
                return 1;
            if (getBrojIndeksa() < bs.getBrojIndeksa())
                return -1;
            return 0;
        }
        return 0;
    }

    @Override
    public Object clone () {
        try {
            BachelorStudent kopija = (BachelorStudent)super.clone();
            kopija.setDatumRodjenja((Date)getDatumRodjenja().clone());
            return kopija;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
