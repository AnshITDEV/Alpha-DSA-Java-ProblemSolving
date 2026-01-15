import java.util.*;


class cost {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost of three items: ");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        sc.close();


       float total = pencil+pen+eraser;

       float billpay = (total*18/100 )+total;

       System.out.println(billpay);
    }
}