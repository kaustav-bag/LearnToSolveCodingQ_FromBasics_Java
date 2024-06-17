package Week2;

import java.util.Scanner;

public class Understanding_Next_NextLine {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       // Scanner sc2=new Scanner(System.in);

            String str=sc.nextLine();
        //    int var=sc.nextInt();

        str=str.replace("$","");
        try {
            double num = Double.parseDouble(str);
            float num2 = Float.parseFloat(str);
            System.out.println(str);
            System.out.println(num);
            System.out.println(num2);
        }
        catch (Exception e){
            System.out.println("exception: "+e);
           // e.printStackTrace();
        }


    }
}
