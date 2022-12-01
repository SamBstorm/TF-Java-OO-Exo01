import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Personne p1 = new Personne();
        System.out.println("Veuillez votre nom :");
        p1.nom = scan.nextLine();
        System.out.println("Veuillez votre prénom :");
        p1.prenom = scan.nextLine();
        System.out.println("Dites un petit mot !");
        p1.parler(scan.nextLine());
        p1.sePresenter();
    }
}
