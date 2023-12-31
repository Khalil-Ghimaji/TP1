public class Main {
    public static void main(String[] args) {
        BankAccount account= new BankAccount(112233,"Ali",100000);
        System.out.println(account.getAccountHolderName()+" has "+account.getBalance()+" in his account n°"+account.getAccountNumber());
    }
}