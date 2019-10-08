/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arac_alis_satis;

/**
 *
 * @author user
 */
public class Arac_alis_satis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        try{
            //database bağlantısı
       
            ana_ekran o1=new ana_ekran();
            o1.setTitle("ARAC ALIS-SATIS PROGRAMI");
            o1.setDefaultCloseOperation(o1.EXIT_ON_CLOSE);
            o1.setLocationRelativeTo(null);
            o1.setVisible(true);
        }
        catch(Exception e){
            System.out.println("catch e düştü");
        }
        
    }
    
}
