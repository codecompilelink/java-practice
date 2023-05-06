/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mahmed.net.playingwithjavastreams;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahmed
 */
public class PlayingWithJavaStreams {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        System.out.println(" Main thread is " + Thread.currentThread().getName());
        
      //  String cities = "Islamabad,Rawalpindi,Karachi,aa,bb,cc";
        String cities = "A,B,C,D,E,F";
        
        List<String> list = List.of(cities.split(","));
        
        System.out.println(" Parallel stream");
        
        list.parallelStream()
              //  .filter(name-> name.length() > 2)
               // .map(str-> str + ",")              
                .forEach(item -> System.out.println(item +" "+Thread.currentThread().getName()));
        
        System.out.println(" stream");
        
         list.stream()
                       
                .forEach(item -> System.out.println(item +" "+Thread.currentThread().getName()));
         
        
        System.out.println("---------------------------------");
        
        
        System.out.println(" without stream");
        
        list                
        .forEach(item -> System.out.println(item +" "+Thread.currentThread().getName()));
         
               
        
        
    }
}
