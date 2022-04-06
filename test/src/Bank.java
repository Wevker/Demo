public class Bank {
    private int money;

    public Bank(int raw_money){
        money = raw_money;
    }
    public void income(int in, int out) throws BankException{
        if (in <= 0 || out <= 0 || in - out <= 0) {
            throw new BankException(in, out);
        }
        int netIncome = in - out;
        System.out.printf("本次计算的纯收入是：%d元\n", netIncome);
        money = money + netIncome;
    }

    public int getMoney(){
        return money;
    }

    public static void main(String[] args) {
        Bank bank = new Bank(100);
        try {
            bank.income(30, 20);
        }
        catch (BankException e){
            System.out.println(e.getMessage());
        }
    }
}
