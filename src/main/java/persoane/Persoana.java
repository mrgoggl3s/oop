package persoane;
//modificatori de acces - public, protected, private si default
//public - modificator de access / access modifier

/**
 * Daca nu aveam modificatorul public, era modificatorul default,
 * iar clasa noastra nu putea fi accesata din afara pachetului persoane
 * pentru clase putem folosi ca modificatori de acces doar public sau default
 */
public class Persoana {

    /**
     * PLANETA este o proprietate a clasei si poate fi accesata doar cu clasa Persoana:
     * Persoana.PLANETA
     * Spre deosebire de campurile NESTATICE unde este nevoie de un obiect creat
     * pentru a le folosi.
     * Este o caracteristica generala pentru acelasi obiect
     */
    public static String PLANETA = "Terra";

    // stare / state
    /**
     * Fieldurile nestatice nu exista pana nu avem creat un obiect.
     * Ele se creaza cate un set pentru fiecare obiect.
     * Luam exemplu sex...
     * Daca vom crea 22 de obiecte Persoana(new Person), vom avea variabila sex
     * de 22 de ori. Spre deosebire de PLANETA care este in continuare o singura variabila
     * aceeasi pentru toata lumea
     */
    public String sex;
    public boolean casatorit; //default este false
    /**
     * modificator de acces protected
     * acest camp va putea fi accesat direct din aceeasi clasa si prin mostenire
     * sau alta clasa care sa fie in ACELASI pachet.
     */
    protected int kg;
    /**
     * modificator de acces default (e atunci cand nu se scrie nimic)
     * acest camp va putea fi accesat direct doar din aceeasi clasa
     * sau alta clasa care sa fie in ACELASI pachet.
     */
    int age; //default este 0
    /**
     * modificator de acces private
     * poate fi folosit campul cu private doar in interiorul clasei
     * unde a fost declarat
     */
    private String nume; //default este null

    public void seCasatoreste() {
        int numar = 0;
        casatorit = true;
    }

    public void divorteaza() {
        casatorit = false;
    }

    //behavior / comportament

    /**
     * behavior sau comportamentul unui obiect este reprezentat prin metode
     * metoda nestatica afiseazaPersoana de mai jos, NU poate fi apelata fara
     * un obiect
     * asa NU MERGE: Persoana.afiseazaPersoana()
     * asa merge: Persoana dan = new Persoana; dan.afiseazaPersoana(),
     * deoarece este un comportament al obiectului instantiat/creat, nu al clasei/matricei
     */
    public void afiseazaPersoana() {
        System.out.println("Nume: " + nume + " - " + "age: " + age);
    }


    /**
     * Metodele statice de mai jos nu au nevoie de obiecte instantiate ca sa fie apelate
     * Ele sunt ale tuturor, apartin matritei.
     * MERGE: Persoana.hello();
     * MERGE, dar nu e indicat: Persoana dan = new Persoana(); dan.hello();
     * exemplul al doilea care nu e indicat e acelasi lucru ca primul, dar poate crea confuzie
     * Intellij va ajuta si puteti observa ca atunci cand apelati sau accesati un camp sau o metoda
     * cu static, el le face italic/aplecat
     */

    public static void hello() {
        System.out.println("Hello");
    }
    public static void afiseaza(Persoana p) {
        System.out.println("Nume: " + p.nume + " - " + "age: " + p.age);
    }

    public static void main(String[] args) {

        System.out.println(Persoana.PLANETA);

        Persoana catalin = new Persoana();
        catalin.nume = "Catalin";
        catalin.age = 31;

        Persoana razvan = new Persoana();
        razvan.nume = "OmProst";
        razvan.age = 30;


        PLANETA = "Spania";
        afiseaza(catalin);
        catalin.afiseazaPersoana();
        System.out.println(PLANETA);
        razvan.afiseazaPersoana();
        System.out.println(PLANETA);

    }



}

/**
 * a nu se face asta. clasa Demonstratie trebuie sa fie in alt fisier.
 * acelasi pachet e ok
 * In acelasi fisier doar o clasa poate avea modificator de acces public,
 * iar ea trebuie sa poarte numele fisierului
 */
class Demonstratie {
    public static void main(String[] args) {
        Persoana mari = new Persoana();
        System.out.println(mari.age);
    }
}
