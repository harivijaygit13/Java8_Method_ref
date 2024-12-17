package StreamsAPI;

public class Order
{
    int amount;
    public Order(int amount)
    {
        this.amount= amount;
    }
    public int getAmount()
    {
        return amount;
    }

    @Override
    public String toString() {
        return "Order = "+amount;
    }
}

class Method_Ref {
    public static void main(String[] args) {
        Placed p= Order::new;
        Order ord= p.ord(20);
        System.out.println(ord);

    }
}
