class calculator
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public double add(double h, double r)
    {
        return h+r;
    }
}




public class methodoverload {
    public static void main(String[] args) {
        calculator obj= new calculator();
        
        int r1=obj.add(3,4);
        System.out.println(r1);

        double u=obj.add(8.2, 8.7);
        System.out.println(u);
        
    }
    
}
