/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OMSpack;

/**
 *
 * @author hevongordon
 */
import java.util.*;
public class testClass {
   static  ArrayList<String>List=new ArrayList<>();
    static String[] tester={"2","3","4"};
    
    public static  ArrayList<String> test()
    {
        for(int i=0;i<tester.length;i++)
        {
            List.add(tester[i]);
        }
        return List;
    }
    public static void main(String[] args)
    {  
//         for(int i=0;i<tester.length;i++)
//        {
//            List.add(tester[i]);
//        }
        testClass.test();
        for(int i=0;i<List.size();i++) 
        {
            System.out.println(List.get(i));
        }
    }
}
