//Student Info - Java 5B Auto Class
//Maahum Sattar, Fall 2024 

public class Auto
{
   //these are my feilds 
   private String make ;
   private String model ;
   private double price ;
   private int year ;
   private int miles ;
   
   //this is my no args constructor 
   public Auto()
   {
      make = "" ;
      model = "" ;
      price = 0.0 ;
      year = 0 ;
      miles = 0 ; 
   }
   
   //full constructor to be used when user passes all appropriate data types
   public Auto(String carMake, String carModel, double carPrice, int carYear, int carMiles)
   {
      make = carMake ;
      model = carModel ;
      price = carPrice ;
      year = carYear ;
      miles = carMiles ;   
   }
   
   //full constructor to be used when user passes all strings
   public Auto(String carMake, String carModel, String carPrice, String carYear, String carMiles)
   {
      make = carMake ;
      model = carModel ;
      setPrice(carPrice) ;  //calling the setter methods to parse 
      setYear(carYear) ;   
      setMiles(carMiles) ;     
   }
   
   //these are my mutators (setters)
   public void setMake(String carMake)
   {
      make = carMake ;
   }
   
   public void setModel(String carModel)
   {
      model = carModel ;
   }
   
   
   //these methods are overloaded
   public void setPrice(double carPrice)
   {
      price = carPrice ;
   }
   
   public void setPrice(String carPriceString)
   {
      price = Double.parseDouble(carPriceString) ;
   }
   
   //these methods are overloaded
   public void setYear(int carYear)
   {
      year = carYear ;
   }
   
   public void setYear(String carYear)
   {
      year = Integer.parseInt(carYear) ;
   }
   
   //these methods are overloaded
   public void setMiles(int carMiles)
   {
      miles = carMiles ; 
   }
   
   public void setMiles(String carMiles)
   {
      miles = Integer.parseInt(carMiles) ;
   }
   
   //these are my accessors (getters)   
   public String getMake()
   {
      return make ;
   }
   
   public String getModel()
   {
      return model ;
   }
   
   public double getPrice()
   {
      return price ;
   }
   
   public int getYear()
   {
      return year ;
   }
   
   public int getMiles() 
   {
      return miles ;
   }
   
   public int getDeprYearsLeft()
   {
      return (5 - (2024 - year) < 0) ? 0 : (5 - (2024 - year)) ;
   }
   
   public double getMileageExp()
   {
      return miles * 0.67 ;
   }
}