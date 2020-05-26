//INHERITANCE
//a mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class
//SuperClass: class whose features are inherited( a base class or parent class)
//keyword: extends

class Bicycle {
    public int gear;
    public int speed;

    //bicycle class has one constructor
    public Bicycle(int gear, int speed) 
    { 
        this.gear = gear; 
        this.speed = speed; 
    } 
          
    // the Bicycle class has three methods 
    public void applyBrake(int decrement) 
    { 
        speed -= decrement; 
    } 
          
    public void speedUp(int increment) 
    { 
        speed += increment; 
    } 
      
    // toString() method to print info of Bicycle 
    public String toString()  
    { 
        return("No of gears are "+gear 
                +"\n"
                + "speed of bicycle is "+speed); 
    }  
} 
  
// derived class 
class MountainBike extends Bicycle  
{ 
      
    // the MountainBike subclass adds one more field 
    public int seatHeight; 
  
    // the MountainBike subclass has one constructor 
    public MountainBike(int gear,int speed, 
                        int startHeight) 
    { 
        // invoking base-class(Bicycle) constructor 
        super(gear, speed); 
        seatHeight = startHeight; 
    }  
          
    // the MountainBike subclass adds one more method 
    public void setHeight(int newValue) 
    { 
        seatHeight = newValue; 
    }  
      
    // overriding toString() method 
    // of Bicycle to print more info 
    @Override
    public String toString() 
    { 
        return (super.toString()+ 
                "\nseat height is "+seatHeight); 
    } 
      
} 
  
// driver class 
public class Test  
{ 
    public static void main(String args[])  
    { 
          
        MountainBike mb = new MountainBike(3, 100, 25); 
        System.out.println(mb.toString()); 
              
    } 
} 

//in above program, when an object of MountainBike class is created, a cope of all the methods and fields of the super class acquire memory in this obj
//https://www.geeksforgeeks.org/inheritance-in-java/