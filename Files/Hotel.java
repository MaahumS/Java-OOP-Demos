//Student Info Java 5B Class Program
//Maahum Sattar, Fall 2024

public class Hotel
{ 
   private int rooms ;
   private int occRooms ;
   private double roomCost ;
   
   //no args constructor 
   public Hotel()
   {
      rooms = 0 ;
      occRooms = 0 ;
      roomCost = 0.0 ;
   }
   
   //full constructor 
   public Hotel(int roomNum, int occRoomNum, double roomCostNum)
   {
      rooms = roomNum ;
      occRooms = occRoomNum ;
      roomCost = roomCostNum ;
   } 
   
   //full constructor w strings
   public Hotel(String roomNum, String occRoomNum, String roomCostNum)
   {
      setRooms(roomNum) ;
      setOccRooms(occRoomNum) ;
      setRoomCost(roomCostNum) ;   
   }
   
   //setters
   public void setRooms(int roomNum)
   {
      rooms = roomNum ;
   }
   
   public void setRooms(String roomNum)
   {
      rooms = Integer.parseInt(roomNum) ; 
   }
   
   public void setOccRooms(int occRoomNum)
   {
      occRooms = occRoomNum ;
   }
   
   public void setOccRooms(String occRoomNum)
   {
      occRooms = Integer.parseInt(occRoomNum) ;
   }
   
   public void setRoomCost(double roomCostNum)
   {
      roomCost = roomCostNum ;
   }
   
   public void setRoomCost(String roomCostNum)
   {
      roomCost = Double.parseDouble(roomCostNum) ;
   }
   
   //getters
   public int getRooms()
   {
      return rooms ;
   }
   
   public int getOccRooms()
   {
      return occRooms ;
   }
   
   public double getRoomCost()
   {
      return roomCost;
   }
   
   public double getFloorRev()
   {
      return occRooms * roomCost ;
   }
   
   public double getFloorOccupancyRate()
   {
      return ((double)occRooms / (double)rooms) * 100 ;
   }
   
   
}