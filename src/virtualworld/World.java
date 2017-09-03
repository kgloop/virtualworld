/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld;

import virtualworld.organisms.Organism;

/**
 *
 * @author Aleksandra
 */
public class World {
    private Organism[][] organisms;
    private static final int WORLD_SIZE = 20;
    
    public World() {
        this.organisms = new Organism[WORLD_SIZE][WORLD_SIZE]; //określenie rozmiaru tablicy organisms i jednoczesne utworzenie obiektu organisms
        this.cleanupOrganisms(); //każdy utworzony nowy świat będzie wyczyszczony z organizmów
    
    }
    
    public void executeTurn(){
        //przejrzeć całą tablicę i jeżeli na aktualnie przeszukiwanym polu istnieje jakikolwiek organizm, wtedy należy wykonać akcję
    }
    
    public void drawWorld(){
        
    }

    public Organism[][] getOrganisms(){ 
        return this.organisms;
    }

    private void cleanupOrganisms() {
        for (int i = 0; i < WORLD_SIZE; i++) { //kolumny
            for (int j = 0; j < WORLD_SIZE; j++) { //wiersze
                this.organisms[i][j] = null; //czyszczenie pól świata poprzez przypisanie im wartości NULL
            }
        }
    }
}
