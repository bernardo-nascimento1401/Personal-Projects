import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class WordList
{
    public static void main(String[] args)
    {
        try
        {
            File newFile = new File("Exhibition.txt");
            Scanner scan = new Scanner(newFile);
            StopWatch timer = new StopWatch();
            ArrayList<String> words = new ArrayList<String>();
            ArrayList<ArrayHelper> wordCount = new ArrayList<ArrayHelper>();

            timer.start(); 
            
            while(scan.hasNext())            
                words.add(scan.next());

            for (int i = 0; i < words.size(); i++)
            {
                words.set(i, words.get(i).toLowerCase());
                words.set(i,words.get(i).replace("?",""));
                words.set(i,words.get(i).replace("!",""));
                words.set(i,words.get(i).replace(",",""));
                words.set(i,words.get(i).replace(".",""));
                words.set(i,words.get(i).replace("\"",""));
                words.set(i,words.get(i).replace("(",""));
                words.set(i,words.get(i).replace(")",""));
            }

            for (int i = 0; i < words.size(); i++)  
                if (!ArrayHelper.hasPrevious(words,words.get(i),i))
                    wordCount.add(ArrayHelper.assignValue(words,words.get(i)));

            while(wordCount.size() > 0)
                System.out.println(ArrayHelper.findMax(wordCount));
                
            timer.stop();
            
            System.out.println("\n" + timer.getElapsedTime());
        }

        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }

    }
}
