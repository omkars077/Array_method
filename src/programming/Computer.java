package programming;

public class Computer {

    public int  addition(){
        int a=456;
        int b=567;

        int output=a+b;
        return output;
    }
    public static void main(String [] args){
        Computer obj= new Computer();
        int var=obj.addition();
        System.out.println("The addition of two values will be : "+var);
    }

}
