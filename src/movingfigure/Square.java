/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author Carmen_Lucia3
 */
public class Square extends Figure{
    
    private int sideLenght;
    
    public Square(int x, int y, int sideLenght) {
        super(x, y);
        this.sideLenght=sideLenght;
    }
    
    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(x, y, sideLenght, sideLenght);
    }
    
}
