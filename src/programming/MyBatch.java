package programming;

public class MyBatch {

    public void storedata(){
        String [] brand={"Samsung","Lenovo","Redmi","Realme","Oppo","Vivo"};
        for (String var : brand){
            System.out.println("This is mobile brand : "+var);
        }
    }
    public void demo1(){
        double [] price={10000.5,12000.5,15000.5,18000.5,20000.5,22000.5};
        for (double var1 : price){
            System.out.println("This is latest price of mobile : "+var1);
        }
    }
    public static void main(String[] args){
        MyBatch obj= new MyBatch();
        obj.storedata();
        obj.demo1();
    }

}
