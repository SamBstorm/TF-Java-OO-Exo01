public class Personne {
    String nom;
    String prenom;

    public void sePresenter(){
        System.out.println("Je m'appelle "+ this.prenom + " " + this.nom);
    }

    public void parler(String phrase){
        System.out.println(this.nom + " " + this.prenom + " a dit : " + phrase);
    }
}
