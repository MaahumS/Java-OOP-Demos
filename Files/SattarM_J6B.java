//Student Info - Java 6B Demo program
//Maahum Sattar, Fall 2024

public class SattarM_J6B
{
   public static void main(String[] args)
   {
      final int NUM_OF_FLOORS = 5 ;
      Hotel[] hotelFloors = new Hotel[NUM_OF_FLOORS] ;
      
      //instanciating hotel objects in each element
      hotelFloors[0] = new Hotel(20,14,168.99) ;
      hotelFloors[1] = new Hotel("33","18","152.99") ;
      hotelFloors[2] = new Hotel(33,12,152.99) ;
      hotelFloors[3] = new Hotel(33,15,152.99) ;
      hotelFloors[4] = new Hotel(16,8,254.99) ;
      
      System.out.println("Floor \t\t Rooms  \t\t  Occupied \t  Occupancy Rate \t\t\tRoom Price \t\t"+     
                                                            "    Revenue") ;
      
      for (int index = 0 ; index < hotelFloors.length ; index++) 
      {
         System.out.printf("  %d \t\t\t  %d  \t\t\t  %d \t\t\t   %.1f%% \t\t\t\t  $%.2f \t\t\t $%.2f\n",
                             index + 1,hotelFloors[index].getRooms(),hotelFloors[index].getOccRooms(),
                                 hotelFloors[index].getFloorOccupancyRate(), hotelFloors[index].getRoomCost(),
                                    hotelFloors[index].getFloorRev()) ;
      }
   }
}