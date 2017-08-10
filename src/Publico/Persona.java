/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Publico;

/**
 *
 * @author Español
 */
import javax.swing.JOptionPane;

public class Persona {
    
    int altura =10;
    public int largo=30;
    final int ojos=1;
   public static void main (String [] args){
       Persona juan = new Persona();
       System.out.println (juan.altura);
       juan.altura=20;
       System.out.println (juan.altura);
       System.out.println (juan.largo);
       
       System.out.println (juan.ojos);
       Persona pedro= new Persona();
       System.out.println ("Juan tiene de altura "+juan.altura+", de largo tiene "+juan.largo+" y tiene "+juan.ojos);
       System.out.println ("Pedro tiene de altura "+pedro.altura+", de largo tiene "+pedro.largo+" y tiene "+pedro.ojos);
       JOptionPane.showMessageDialog(null, "Juan\n"+ "Tiene de altura:"+juan.altura+"\nTiene de largo:"+juan.largo+"\nTiene "+juan.ojos+" ojo");
       JOptionPane.showMessageDialog(null, "Pedro\n"+ "Tiene de altura:"+pedro.altura+"\nTiene de largo:"+pedro.largo+"\nTiene "+pedro.ojos+" ojo");
   }   
    
    
}
