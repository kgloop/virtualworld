/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld.organisms;

import java.awt.Point;
import virtualworld.World;

/**
 *
 * @author Aleksandra
 */
public abstract class Organism {
    protected int force; //jeżeli protected to klasy dziedziczące po klasie Organism wiedzą, czym jest pole force
    protected int initiative;
    protected Point position;
    protected World world;
    
    public abstract void action(); //abstrakcyjna metoda void, która musi być zawarta w każdej klasie dziedziczącej po klasie Organism
    public abstract void collision(); //to samo, co wyżej
    public abstract void drawing(); //to samo, co wyżej
}
