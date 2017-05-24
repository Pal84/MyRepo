import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Pair {
public static void main(String[] args) {
Collection<String> words = new ArrayList<String>();

words.add("Don't"); words.add("change"); words.add("me!");
System.out.println("Before: " + words);
Iterator<String> itr=words.iterator(); 
//for (String word : words) {
while(itr.hasNext()){ 
//System.out.print(word.toUpperCase() + "_");
System.out.print(itr.next().toUpperCase() + "_");
}
System.out.println();
System.out.println("After:  " + words);
}
}
 
