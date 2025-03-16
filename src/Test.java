public class Test {
    public static void main(String[] args) {
        String universityName = "TUIT ";

        University poli = new University(universityName);

        poli.setRector("Guido", "Saracco");

        System.out.println("Rector of " + poli.getName() + " : " + poli.getRector()); // Guido Saracco

        int s1 = poli.enroll("Mario","Rossi");
        int s2 = poli.enroll("Giuseppe","Verdi");
        int s3 = poli.enroll("javohir","Komilbayev");

        int s4 = poli.enroll("Mario","Rossi");
        int s5 = poli.enroll("Giuseppe","Verdi");
        int s6 = poli.enroll("javohir","Komilbayev");

        System.out.println("Enrolled students " + s1 + ", " + s2+s3); // 10000, 10001
        System.out.println("s1 = " + poli.student(s3)); // 10000 Mario Rossi


       int macro = poli.activate("Macro Economics", "Paul Krugman");
        int oop = poli.activate("Object Oriented Programming", "James Gosling");

        System.out.println("Activated courses " + macro + " and " + oop); // 10 and 11
        System.out.println("macro = " + poli.course(macro));
        poli.register(s1, macro);
        poli.register(s2, macro);
        poli.register(s2, oop);

        System.out.println(poli.listAttendees(macro));
        // 10000 Mario Rossi
        // 10001 Giuseppe Verdi

        System.out.println(poli.studyPlan(s2));
        // 10,Macro Economics,Paul Krugman
        // 11,Object Oriented Programming,James Gosling*/

    }
}
