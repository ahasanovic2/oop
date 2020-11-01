package ba.unsa.etf.rpr;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    BachelorStudent bs = new BachelorStudent("Ahmedin",18646);
        System.out.println(bs.getIme());
        bs.ispisi();
        Student s = bs;
        s.ispisi();
        Osoba o = s;
        o.ispisi();
        bs.setDatumRodjenja(new Date (100,1,1));
        if (bs.compareTo(s)==0) System.out.println("Jednaki su");
        BachelorStudent bs2 = (BachelorStudent)bs.clone();
        bs2.setIme("Pero Perić");
        bs2.setBrojIndeksa(18626);
        bs2.getDatumRodjenja().setYear(101);
        System.out.println(bs.getDatumRodjenja());
    }

    private static void funkcija(Object o) {
        if (o instanceof Student)
            System.out.println("Ime studenta: " + ((Student) o).getIme());
        if (o instanceof String)
            System.out.println("String: " + ((String) o));
    }
}
