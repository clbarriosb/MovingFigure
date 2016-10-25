/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author Carmen_Lucia3
 */
public class UserInterface implements Runnable {

    private JFrame frame;
    private Figure figure;
    
    public UserInterface(Figure figure){
        this.figure=figure;
    }

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        addListeners();

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        DrawingBoard drawingBoard = new DrawingBoard(figure);
        container.add(drawingBoard);
        
        frame.addKeyListener(new KeyboardListener(figure, drawingBoard));
    }

    private void addListeners() {
    }

    public JFrame getFrame() {
        return frame;
    }
}
