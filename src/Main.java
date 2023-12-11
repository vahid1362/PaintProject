import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        JFrame application = new JFrame( "A simple paint program" );
        PaintPanel paintPanel = new PaintPanel();
        application.add(paintPanel, BorderLayout.CENTER);
        application.add( new JLabel( "Drag the mouse to draw" ),
                BorderLayout.SOUTH );
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.setSize( 400, 200 ); // set frame size
        application.setVisible( true ); // display frame
    }
}