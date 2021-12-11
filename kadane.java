import java. util.*;
public class kadane {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array");
        int l = in.nextInt();
        int a[] = new int[l];
        for(int i = 0;i<l; i++){
            System.out.println("Enter value of array");
            a[i] = in.nextInt();
        }
        
        int s = 0, max = a[0];

        for(int i = 0; i<l; i++){
            s = s + a[i];
            if(s > max) max = s;
            if (s<0) s = 0;
        }
        System.out.println(max);
    }
    
}
