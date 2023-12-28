class Ashu{
public void show() throws ClassNotFoundException
{

    Class.forName("gfc");
   /*/ try{
        Class.forName("gfc");
    }
    catch(ClassNotFoundException e)
    {
        System.out.println("class not found");
    }*/
}
}



public class exception3 {
    public static void main(String[] args){
        
        Ashu obj=new Ashu();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
           
            e.printStackTrace();
        }
    }
}
