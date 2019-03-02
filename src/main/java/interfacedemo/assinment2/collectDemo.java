
package interfacedemo.assinment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class collectDemo implements interDemo{
    
    //lists can contain duplicates
    public void listDemo(){
       
        List<Integer> list = new ArrayList<Integer>();
        
        int count[] = {34, 22,10,60,30,22};
            
            for(int i = 0; i < count.length; i++) {
                list.add(count[i]);
            }
        
        System.out.println("List = " + list);
        System.out.println("Duplicates are allowed in lists");
        System.out.println("\t");
    }
    
    //Set does not contain duplicates
    public void setDemo(){
        
        int count[] = {34, 22,10,60,30,22};
        
        Set<Integer> set = new HashSet<Integer>();
        
        try {
            for(int i = 0; i < count.length; i++) {
                set.add(count[i]);
            }
         
        System.out.println("Set = " + set);
        System.out.println("Sets do not allow duplicates");
        System.out.println("\t");
        }
        
        catch(Exception e) {}
   }
    
    
    
    public void mapDemo(){
        Map map = new HashMap(); 
        
        map.put("Damien", "34");
        map.put("John", "22");
        map.put("Bob", "10");
        map.put("Sam", "60");
        map.put("Smith", "30");
        map.put("1", "22");

        System.out.println();
        System.out.println("Map = " + map);
        System.out.println("The key Bob is equal to: " + map.get("Bob"));
        System.out.print("\t");
    }
}
