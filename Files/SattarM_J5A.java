//Student Info - Java 5A Demo Program
//Maahum Sattar, Fall 2024 

public class SattarM_J5A
{
   public static void main(String[] args)
   {

      //now I will create 3 instances of the Boat class
      
      //first instance calls no args constructor then sets each field individually
      Boat owner1 = new Boat() ;
      owner1 .setName("Jimmy Smith") ;
      owner1.setAddress("4924 Weems Way") ;
      owner1.setCity("Carrolton") ;
      owner1.setState("TX") ;
      owner1.setZip("75920") ;
      owner1.setReg("TX3291936") ;
                                           
      //displaying results for boat owner 1 by calling public method getName , getAddress, etc.
      System.out.println("\nName: " + owner1.getName()) ; 
      System.out.println("Address: " + owner1.getAddress()) ; 
      System.out.println("City: " + owner1.getCity()) ;
      System.out.println("State: " + owner1.getState()) ;
      System.out.println("Zipcode: " + owner1.getZip()) ;
      System.out.println("Registration ID: " + owner1.getReg()) ;                                     
                                           
      Boat owner2 = new Boat("Rajesh Koothrapoli","1382 Penny Dr", "Bedford",
                                             "TX", "75130", "TX8351852") ;
                                             
      System.out.println("\nName: " + owner2.getName()) ; 
      System.out.println("Address: " + owner2.getAddress()) ; 
      System.out.println("City: " + owner2.getCity()) ;
      System.out.println("State: " + owner2.getState()) ;
      System.out.println("Zipcode: " + owner2.getZip()) ;
      System.out.println("Registration ID: " + owner2.getReg()) ;                                     
                 
      Boat owner3 = new Boat("Amy Farrah Fowler", "153 Gibbons", "Argyle",
                                                "TX","76280G","TX1876183") ; 
      
      System.out.println("\nName: " + owner3.getName()) ; 
      System.out.println("Address: " + owner3.getAddress()) ; 
      System.out.println("City: " + owner3.getCity()) ;
      System.out.println("State: " + owner3.getState()) ;
      System.out.println("Zipcode: " + owner3.getZip()) ;
      System.out.println("Registration ID: " + owner3.getReg()) ;                                           
      
   }
}