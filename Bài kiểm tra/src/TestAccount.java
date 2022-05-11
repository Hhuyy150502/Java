public class TestAccount {
    public static void main(String[] args){
        Account acc1 = new Account();
        acc1.input();
        acc1.depositAndWithdraw(100,0);
        System.out.println(acc1);
    }
}