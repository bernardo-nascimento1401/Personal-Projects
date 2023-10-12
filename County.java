

public class County
{
    private String name;
    private int burgered;
    private int population;
    public County(String n, int b, int p)
    {
        name = n;
        burgered = b;
        population = p;
    }
    
    public int getBurgered()
    {
        return burgered;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setBurgered(int b)
    {
        burgered = b;
    }
    
    public int getPopulation()
    {
        return population;
    }
}
