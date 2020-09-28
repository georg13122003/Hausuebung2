/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pkg2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gmairhuber18
 */
public class HalloJavaMitForEach {
    static List<String> list = new ArrayList<String>();
    
    public static void main(String args[])
    {
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.forEach((String s) -> System.out.println(s));
    }
    
}
