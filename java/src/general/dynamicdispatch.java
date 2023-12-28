package general;



class a{
    public void show()
    {
        System.out.println("in A show");
    }

}
class b extends a{
    public void show()
    {
        System.out.println("in B show");
    }
}
public class dynamicdispatch {
    public static void main(String[] args) {
        
    
    a obj=new a();
    obj.show();
    

    obj=new b();
    obj.show();
    }
}
