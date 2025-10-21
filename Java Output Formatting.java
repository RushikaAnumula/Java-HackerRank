import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                String spaces="";
                for(int j=s1.length();j<15;j++) spaces+=" ";
                String num=String.valueOf(x);
                if(x<10) num="00"+x;
                else if(x<100) num="0"+x;
                System.out.println(s1+spaces+num);
            }
            System.out.println("================================");
    }
}
