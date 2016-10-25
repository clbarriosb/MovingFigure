/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Carmen_Lucia3
 */
public class CompoundFigure extends Figure{
    
    ArrayList<Figure> figure;
    Box box;
    Circle circle;
    Square square;
    
    public CompoundFigure(int x, int y){
        super(x,y);
        this.figure= new ArrayList<>();
    }
    
    public CompoundFigure(){
        super(1,2);
        this.figure= new ArrayList<>();
    }
    
    public void add(Figure f){
        this.figure.add(f);
    }
    
    @Override
    public void draw(Graphics graphics){
        for (Figure drawing : this.figure) {
            drawing.draw(graphics);
        }
    }
    
    @Override
    public void move(int dx, int dy){
        for (Figure drawing: this.figure) {
            drawing.move(dx, dy);
        }
    }
}
