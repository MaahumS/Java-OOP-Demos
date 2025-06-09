//Student Info Java 5A - Boat Class 
//Maahum Sattar, Fall 2024

public class Boat
{
  
   //these are my feilds 
   private String name ;
   private String address ;
   private String city ; 
   private String state ; 
   private String zipCode ;
   private String regID ;
   
   //this is my noargs constructors
   public Boat() 
   {
      name = "" ;
      address = "" ;
      city = "" ;
      state = "" ;
      zipCode = "" ; 
      regID = "" ; 
   }
   
   //this is my full constructor 
   public Boat(String n, String a, String c, String s, String z, String r)
   {
      name = n ;
      address = a ;
      city = c ;
      state = s ;
      zipCode = z ;
      regID = r ;
   }
   
   //these are my mutator methods (setters)
   public void setName(String n)
   {
      name = n ;
   }
   
   public void setAddress(String a)
   {
      address = a ;
   }
   
   public void setCity(String c)
   {
      city = c ;
   }
   
   public void setState(String s)
   {
      state = s ;
   }
   
   public void setZip(String z)
   {
      zipCode = z ;
   }
   
   public void setReg(String r)
   {
      regID = r ;
   }
   
   //these are my acessor methods (getters)   
   public String getName()
   {
      return name ;
   }
  
   public String getAddress()
   {
      return address ;
   }
  
   public String getCity()
   {
      return city ;
   }
  
   public String getState()
   {
      return state ;
   }
   
   public String getZip()
   {
      return zipCode ;
   }
   
   public String getReg()
   {
      return regID ;
   } 
   
}