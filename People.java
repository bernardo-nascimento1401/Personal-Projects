

public class People
{
    private boolean received;
    private String name;
    
    public People(String n, boolean r)
    {
        name = n;
        received = r;
    }
    
    public String getName()
    {
        return name;
    }
    
    public boolean getReceived()
    {
        return received;
    }
    
    public void setReceived(boolean r)
    {
        received = r;
    }
}
