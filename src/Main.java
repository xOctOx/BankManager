//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creation des instances des 3 classes enfants
       CheckingAccount ca = new CheckingAccount("compte courant", 10000);
       SavingsAccount sa = new SavingsAccount("compte d'épargne", 500);
       COD cod = new COD("certificat de dépôt", 250);


       // Affichage
        System.out.println("*****Compte Courant*****");
        System.out.println("Compte : " + ca.account);
        System.out.println("Solde : " + ca.balance);

        // Modification des attributs
        ca.account = "compte courant modifié";
        ca.balance = 99000;
        System.out.println("-- Apres modification --");
        System.out.println("Compte : " + ca.account);
        System.out.println("Solde : " + ca.balance);

        //SavingsAccount
        System.out.println("*****Compte Epargne*****");
        System.out.println("Compte : " + sa.account);
        System.out.println("Solde : " + sa.balance);

        // Modification des attributs
        sa.account = "compte épargne modifié";
        sa.balance = 5000;
        System.out.println("-- Apres modification --");
        System.out.println("Compte : " + sa.account);
        System.out.println("Solde : " + sa.balance);

        //COD
        System.out.println("*****Certificat de Depot*****");
        System.out.println("Compte : " + cod.account);
        System.out.println("Solde : " + cod.balance);

        // Modification des attributs
        cod.account = "certificat de dépôt modifié";
        cod.balance = 8000;
        System.out.println("-- Apres modification --");
        System.out.println("Compte : " + cod.account);
        System.out.println("Solde : " + cod.balance);

        System.out.println("-----------------");
    }
}