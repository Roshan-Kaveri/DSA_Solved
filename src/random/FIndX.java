import java.util.*;

public class Main {
  
    public static void findX(int A, int B, int C){
      
      int ans = 0;
      for(int i =  ; i < 32 ; i++){
        int xi = (A >> i) & 1;
        int yi = (B >> i) & 1;
        int ci = (C >> i) & 1;
        
        if(ci == 1){
           if(xi == 0 || yi == 0){
           ans = ( ans << 1 ) | 1;
          }
          
        }else{
          if(xi == 1 || yi == 1){
            System.out.println("-1");
            return;
          }
        }
      }
        System.out.println(ans + "");
      
      
    }
  
  
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int tc = sc.nextInt();
      while(tc-- > 0){
       
       int A = sc.nextInt();
       int B = sc.nextInt();
       int C = sc.nextInt();
       
       
       findX(A, B, C);
       
      }

    }
  }