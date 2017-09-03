/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld;

/**
 *
 * @author Aleksandra
 */
public class VirtualWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* World world = new World();
        while (true){
            Key k = ActionListener.GetKey();
            if(k.key != Key.ESC){
                world.executeTurn(k.key);
            }            
            else{
                System.out.println("Koniec programu");
                break;
            }
        }*/
       
       World world = new World(); //utworzenie obiektu klasy world (utworzenie świata)
       while (true){
           world.executeTurn(); //charakter turowy gry, pętla będzie się cały czas wykonywać - metode
       }
       
    }
    
}
