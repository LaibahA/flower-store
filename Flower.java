import java.util.*;

public class Flower extends ConsoleProgram
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
    
    //constructor 
    //flower (type, color, amount)
    public Flower(String species, String color, int amount)
    {
        this.species = species;
        //species = species.toLowerCase();
        this.color = color;
        this.amount = amount;
        if(species.equalsIgnoreCase("rose"))
        {
            type = ROSE_PRICE;
        }
        if(species.equalsIgnoreCase("tulip"))
        {
            type = TULIP_PRICE;
        }
        if(species.equalsIgnoreCase("peony"))
        {
            type = PEONY_PRICE;
        }
        if(species.equalsIgnoreCase("lily"))
        {
            type = LILY_PRICE;
        }
        if(species.equalsIgnoreCase("daffodil"))
        {
            type = DAFFODIL_PRICE;
        }
        //get price, static type * amount 
        price = amount * type;
    }

    //get species 
    public String getSpecies()
    {
        return species; 
    }
    //get which flower, color + type
    public String toString()
    {
        return "A " + color + " " + species;
    }
    //returns price
    public int getPrice()
    {
        return price; 
    }
    //returns color
    public String getColor()
    {
        return color;
    }  
}
