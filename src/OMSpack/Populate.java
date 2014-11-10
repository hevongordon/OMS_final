/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OMSpack;

import java.io.File;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author hevongordon
 */
public class Populate {
   static Scanner scan;
    static omsSearch search=new omsSearch();
    int i=0;
    //String [][] container=new String[99][99];
 static String [] holder=new String[2];
 static String[] Iter=new String[100];
 static String[] container=new String[100];
  static ArrayList<String>List=new ArrayList<>();
  
public static void main(String []af)
        
{
   
  Populate.populate();
    for(int i=0;i<List.size();i++)
    {
        System.out.println(Populate.List.get(i));
    }
}
     public static ArrayList<String> populate()
    
    {
        try{
         File file=new File("C:\\Users\\hevongordon\\Desktop\\OMSdata\\reportFile.txt");
           scan=new Scanner(file);
           while(scan.hasNextLine())
           {
          
               String cont=scan.nextLine().trim();
               
               if (cont.equals("")||cont.equals("-------NEW REPORT------"))
               {
                   continue;
               }
               holder=cont.split(":");
             
               //Iter[i]=holder[1].trim();
               List.add(holder[1]);
                //System.out.println(Iter[i]);
                 //i++;
           }
           
        }
         catch(Exception e)
    {}
           return List;
    }
     
   
    
}
    
    
   
    
   


    
   
    

