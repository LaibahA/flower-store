import java.util.*;

public class Order extends ConsoleProgram
{
    private static final int ROSE_PRICE = 10;
    private static final int TULIP_PRICE = 7;
    private static final int PEONY_PRICE = 12;
    private static final int LILY_PRICE = 5;
    private static final int DAFFODIL_PRICE = 3;
    
    private String species;
    private String color;
    private int amount;
    private int price;
    private int type;
    
    private String choice;
    private String theColor = "";
    
    private String theFlowers;
    private int thePrice;
    
    private Flower forFlower;
    private Bouquet forBouquet;
    
    public Order()
    {
        
    }
    //this gets the users choice and returns it
    public String theChoice()
    {
        choice = readLine("Do you want a bouquet or single flower type? (enter bouquet or flower) ");
        return choice;
    } 
    //this takes the three parameters and makes a flower for order
    public void takeFlowerOrder()
    {
        species = readLine("What type of flower would you like? ");
        color = readLine("What color? ");
        amount = readInt("How many do you want? ");
        
        forFlower = new Flower(species, color, amount);
        
    }
    //this takes all the parameters for 3 types of flowers in a bouquet and makes a bouquet
    public void takeBouquetOrder()
    {
        System.out.println("A bouquet comes with 3 types of flowers, you can choose a single color for each type of flower you choose.");
        
        species = readLine("What type of flower would you like? ");
        color = readLine("What color? ");
        theColor += color + ", ";
        amount = 1;
        Flower one = new Flower(species, color, amount);
        
        species = readLine("What type of flower would you like next? ");
        color = readLine("What color? ");
        theColor += color + ", and ";
        amount = 1;
        Flower two = new Flower(species, color, amount);
        
        species = readLine("What type of flower would you like last? ");
        color = readLine("What color? ");
        theColor += color + ".";
        amount = 1;
        Flower three = new Flower(species, color, amount);
        
        forBouquet = new Bouquet(one, two, three);
    }
    //this returns a receipt of the users order
    public String yourOrder()
    {
        if(choice.equalsIgnoreCase("bouquet"))
        {
            theFlowers = forBouquet.getFlowersInBouquet();
            thePrice = forBouquet.getBouquetPrice();
        }
        if(choice.equalsIgnoreCase("flower") || choice.equalsIgnoreCase("flowers"))
        {
            theFlowers = forFlower.getSpecies();
            theFlowers += " ";
            theColor = forFlower.getColor();
            thePrice = forFlower.getPrice();
        }
        
        return "Your order was a type of: " + choice + ". Flowers contained: " + theFlowers + " \nThey are respectively: " + theColor + " \nThe total is: " + "$" +thePrice + ".00";
    }
    
}
