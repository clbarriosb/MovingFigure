/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import javax.swing.SwingUtilities;

/**
 *
 * @author Carmen_Lucia3
 */
public class Main {

    public static void main(String[] args) {
        CompoundFigure truck = new CompoundFigure();

        truck.add(new Box(220, 110, 75, 100));
        truck.add(new Box(80, 120, 200, 100));
        truck.add(new Circle(100, 200, 50));
        truck.add(new Circle(220, 200, 50));

        UserInterface ui = new UserInterface(truck);
        SwingUtilities.invokeLater(ui);
    }
}
