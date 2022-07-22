import java.util.*;

public class Bouquet extends ConsoleProgram
{
    private static final int ROSE_PRICE = 10;
    private static final int TULIP_PRICE = 7;
    private static final int PEONY_PRICE = 12;
    private static final int LILY_PRICE = 5;
    private static final int DAFFODIL_PRICE = 3;
    
  
    private String color;
    private int amount;
    private int price;
    private int type;
    
    private int sum;
    private String value = "";
    
    private ArrayList<Flower> bouquet;
    //makes a bouquet
    public Bouquet(Flower one, Flower two, Flower three)
    { 
        bouquet = new ArrayList<Flower>();
      
        bouquet.add(one);
        bouquet.add(two); 
        bouquet.add(three);
    }
    //gets bouquets price by getting the price of all the flowers in bouquet
    public int getBouquetPrice()
    {
        for(int i = 0; i < bouquet.size();i++)
        {
            int temp = (bouquet.get(i)).getPrice();
            sum += temp;
        }
        return sum; 
    }
    //figures out what flowers are in the bouquet
    public String getFlowersInBouquet()
    {
        for(int i = 0; i < bouquet.size();i++)
        {
            value += (bouquet.get(i)).getSpecies() + ". ";
        }
        return value; 
    }
    
}
