//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       CheckingAccount ca = new CheckingAccount("compte courant", 10000, 50000);
       SavingsAccount sa = new SavingsAccount("compte d'épargne", 500, 2300);
       COD cod = new COD("certificat de dépôt", 250, 5000);

       //checkingAccount
        System.out.println("*****Compte Courant*****");
        System.out.println("Compte : " + ca.account);
        System.out.println("Solde : " + ca.balance);


        //savingAccount
        System.out.println("*****Compte Epargne*****");
        System.out.println("Compte : " + sa.account);
        System.out.println("solde : " + sa.balance);


        //COD
        System.out.println("*****Certificat de Depot*****");
        System.out.println("COD : " + cod.account);
        System.out.println("solde : " + cod.balance);
        System.out.println("-----------------");
    }
}