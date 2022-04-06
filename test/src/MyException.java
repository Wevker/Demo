public class MyException extends Exception{
    String massage;
    public MyException(String massage){
        this.massage = massage;
    }

    public String getMassage(){
        return massage;
    }
}
