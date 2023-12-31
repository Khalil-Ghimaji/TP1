// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            BankAccount account= new BankAccount(112233,"Ali",100000);
            //System.out.printf("{} has {} in his account n°{}".format(account.getAccountHolderName(),account.getBalance(),account.getAccountNumber()));
            System.out.println(account.getAccountHolderName()+" has "+account.getBalance()+" in his account n°"+account.getAccountNumber());
        }
    }
