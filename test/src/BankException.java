public class BankException extends Exception{
    String message;

    public BankException(int m, int n){
        if (m <= 0)
            message = "入账资金" + m + "是负数,这不符合系统要求。";
        else if (n <= 0)
            message = "支出" + n + "是负数,这不符合系统要求。";
        else if (m - n <= 0)
            message = "计算收入小于0,这不符合系统要求。";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
