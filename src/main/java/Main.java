import persoane.Persoana;

public class Main {

    public static void main(String[] args) {


        Persoana razvan = new Persoana();

        System.out.println("casatorit: " + razvan.casatorit);


        System.out.println("apelez se casatoreste");
        razvan.seCasatoreste();

        System.out.println("casatorit: " + razvan.casatorit);

        Persoana cineva = new Persoana();
        System.out.println(cineva.casatorit);

        System.out.println("apaleze divorteaza");
        razvan.divorteaza();

        System.out.println("casatorit: " + razvan.casatorit);



    }
}
