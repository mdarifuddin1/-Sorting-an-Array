
package code;

import java.util.Arrays;



public class Sorting {
    
    public static void main(String[] args) {
        
        
        int []num  = {5,2, 34,7, 10};
        
        System.out.println("Asceding ");
        
      Arrays.sort(num);
      
      for(int i =0; i<5;i++)
      {
          System.out.print(" "+num[i]);
      }
      
        System.out.println();
      
       System.out.println("dsceding ");
        
      
      
      for(int i =4; i>=0;i--)
      {
          System.out.print(" "+num[i]);
      }
      
       System.out.println();
       
       
       String [] Name = {"Nizam", "Nizam" , "Tamnna", "Arif"};
       
               System.out.println("Asceding String ");
               
               Arrays.sort(Name);
               
               
               for(int i =0; i<4; i++)
               {
                   System.out.println(" "+Name[i]);
               } 
               
               
                System.out.println("Dsceding String ");
               
               Arrays.sort(Name);
               
               
               for(int i =3; i>=0; i--)
               {
                   System.out.println(" "+Name[i]);
               } 
    }
}
