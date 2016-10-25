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
public class Box extends Figure {
    
    private int width;
    private int height;
    
    public Box (int x, int y, int width, int height){
        super(x,y);
        this.height=height;
        this.width=width;
    }
    
    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(x, y, width, height);
    }
    
}
