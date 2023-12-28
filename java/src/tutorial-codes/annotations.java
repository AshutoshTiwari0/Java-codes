class Annoy
{
public void showAwala()// see the method names are very simlar only one letter is cahnged.
{
System.out.println("in A show");
}
}
class Bnnoy extends Annoy
{
  //  @Override// annotation showing ki yaha pe override karna hai . but now java knows ki function name is different so override nhi hoga so giving error.
    public void showBwala()
    {
        System.out.println("in B show");
    }
}

// is wali mai error rahne do 


public class annotations {
    public static void main(String[] args) {
        Bnnoy obj=new Bnnoy();
        obj.showAwala();
    }
}
