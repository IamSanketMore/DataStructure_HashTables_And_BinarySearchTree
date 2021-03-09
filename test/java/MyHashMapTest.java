import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyHashMapTest
{
    @Test
    public void givenFrequentWordsShouldReturnFrequency()
    {
        String sentence = "To Be Or Not To Be";
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words)
        {
            Integer value = myHashMap.get(word);
            if (value == null)
                value=1;
            else
                value=value+1;
            myHashMap.add(word,value);
        }
        int freq = myHashMap.get("to");
        int freq1 = myHashMap.get("be");
        System.out.println("Frequently word occurs in \n To Be Or Not To be");
        System.out.println("To Frequency Occurs - "+freq+" Times");
        System.out.println("be Frequency Occurs - "+freq1+" Times");
        Assertions.assertEquals(2,freq);
        Assertions.assertEquals(2,freq1);
    }

}