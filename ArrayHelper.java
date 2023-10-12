import java.util.ArrayList;

public class ArrayHelper
{
    private String word;
    private int count;
    
    public ArrayHelper(String w, int c)
    {
        word = w;
        count = c;
    }
    
    public static boolean hasPrevious(ArrayList<String> arr, String thisWord, int index)
    {
        for (int i = 0; i < index; i++)        
            if (thisWord.equals(arr.get(i)))
                return true;
        
        
        return false;
    }
    
    public static ArrayHelper assignValue(ArrayList<String> arr, String thisWord)
    {
        int times = 0;
        for (String item : arr)        
            if (thisWord.equals(item))
                times++;
        
        
        return new ArrayHelper(thisWord, times);
    }
    
    public static ArrayHelper findMax(ArrayList<ArrayHelper> arr)
    {
        int max = 0;
        int index = 0;
        
        for (int i = 0; i < arr.size(); i++)        
            if (arr.get(i).getCount() > max)
            {
                max = arr.get(i).getCount();
                index = i;
            }
            
        ArrayHelper maxItem = arr.get(index);
        arr.remove(index);
        
        return maxItem;
        
    }
    
    
    public int getCount()
    {
        return count;
    }
    
    public String getWord()
    {
        return word;
    }
    
    public String toString()
    {
        return getWord() + ": " + getCount();
    }
    
    
}
