package general;


enum hotel
{
    rooms, spas, foodcourt, reception;
}


public class enums {
    public static void main(String[] args) {
      hotel r=  hotel.rooms; // hotel is type and rooms is the variable so thats why hotel(type) variable.
        System.out.println(r);
        hotel s=hotel.spas;
        // function to return the class 
        Class<? extends hotel> c=s.getClass();
        System.out.println(c);
        if(s.ordinal()==1) // ordinal tells location of variable inside enum
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
