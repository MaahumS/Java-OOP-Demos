//Student Info - Java 5B Demo Program
//Maahum Sattar, Fall 2024 

public class SattarM_J5B
{
   public static void main(String[] Args)
   {
      //now , i will create 4 instances of the auto class
      
      //first instance tests no args constructor
      Auto car1 = new Auto() ;
      car1.setMake("Chevrolet") ;
      car1.setModel("Equinox") ;
      car1.setPrice(26995) ;
      car1.setYear(2022) ;
      car1.setMiles(26636) ;
      
      //Displaying results for car1 
      System.out.println("Make: " + car1.getMake()) ;
      System.out.println("Model: " + car1.getModel()) ;
      System.out.printf("Purchase Price: $%,.2f\n",car1.getPrice()) ;
      System.out.println("Year: " + car1.getYear()) ;
      System.out.printf("Annual Miles: %,d\n", car1.getMiles()) ;
      System.out.println("Depr Years Left: " + car1.getDeprYearsLeft()) ;
      System.out.printf("Mileage Expense: $%,.2f\n", car1.getMileageExp()) ;
      
      //2nd instance tests no args constructor & passes all strings
      Auto car2 = new Auto() ;
      car2.setMake("Infiniti") ;
      car2.setModel("QX80") ;
      car2.setPrice("66700") ;
      car2.setYear("2021") ;
      car2.setMiles("15294") ;
      
      //Displaying results for car2
      System.out.println("\nMake: " + car2.getMake()) ;
      System.out.println("Model: " + car2.getModel()) ;
      System.out.printf("Purchase Price: $%,.2f\n",car2.getPrice()) ;
      System.out.println("Year: " + car2.getYear()) ;
      System.out.printf("Annual Miles: %,d\n", car2.getMiles()) ;
      System.out.println("Depr Years Left: " + car2.getDeprYearsLeft()) ;
      System.out.printf("Mileage Expense: $%,.2f\n", car2.getMileageExp()) ;
      
      //third instance tests full constructor & passes all appropriate data types     
      Auto car3 = new Auto("Cadillac","CTS-V",65040,2023,18923) ; 
      
      //Displaying results for car3 
      System.out.println("\nMake: " + car3.getMake()) ;
      System.out.println("Model: " + car3.getModel()) ;
      System.out.printf("Purchase Price: $%,.2f\n",car3.getPrice()) ;
      System.out.println("Year: " + car3.getYear()) ;
      System.out.printf("Annual Miles: %,d\n", car3.getMiles()) ;
      System.out.println("Depr Years Left: " + car3.getDeprYearsLeft()) ;
      System.out.printf("Mileage Expense: $%,.2f\n", car3.getMileageExp()) ;
      
      //fourth instance tests our overloaded full constructor that receives all strings     
      Auto car4 = new Auto("Ford","Titanium","41315","2018","20851") ; 
      
      //Displaying results for car4
      System.out.println("\nMake: " + car4.getMake()) ;
      System.out.println("Model: " + car4.getModel()) ;
      System.out.printf("Purchase Price: $%,.2f\n",car4.getPrice()) ;
      System.out.println("Year: " + car4.getYear()) ;
      System.out.printf("Annual Miles: %,d\n", car4.getMiles()) ;
      System.out.println("Depr Years Left: " + car4.getDeprYearsLeft()) ;
      System.out.printf("Mileage Expense: $%,.2f\n", car4.getMileageExp()) ;
      
   }
}