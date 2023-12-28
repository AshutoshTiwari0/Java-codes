class laptop
{
     String model;
     int price;

     public String toString()
     {
        return model+" "+price;
     }
     public boolean equals(laptop that){
        if(this.model.equals(that.model)&& this.price==that.price)
        {
            return true;
        }
        else{
            return false;
        }
     }
}








public class objectclass {
    public static void main(String[] args) {
        laptop obj=new laptop();
        obj.model="Lenevo Yoga";
        obj.price=1000;
      


         laptop obj1=new laptop();
        obj1.model="Lenevo Yoga";
        obj1.price=1000;

        boolean result=obj.equals(obj1);
        System.out.println(result);
        
    }
}
