 class A{
    public A(){
        System.out.println("object created");
    }





public void show(){
    System.out.println("in A show");
}
}

public class anonymousobject {
    public static void main(String[] args) {
        new A(); //this is annonyomous object
        new A().show();
    }
}




// object creation=new A(); sirf yhi hota hai object creation 
// if we dont assign it then it is anonymous object .
