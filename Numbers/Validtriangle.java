package Numbers;
import java.util.*;
public class Validtriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int o=sc.nextInt();
        if(m>0 && n>0 && o>0 && m+n+o==180){
            System.out.println("Valid triangle");
        }else{
            System.out.println("Not a valid triangle");
        }
    }
    
}
