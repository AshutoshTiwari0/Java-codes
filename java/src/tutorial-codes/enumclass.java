enum laptop
{
    Macbook(2000),XPS(1500),G15(),Inspiron(600);// these are objects and(price)
    private int price;

    private laptop() {
        price=500;// constructor jisme bhi parameter nhi hai like in g15() value of price will be 500 of g15
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    laptop(int price)
    {
        this.price=price;
    }

}

public class enumclass {
    public static void main(String[] args) {
        laptop lap=laptop.Inspiron;
        System.out.println(lap+" "+lap.getPrice());//lap is of xps so price will be of inspiron too
    }
}
