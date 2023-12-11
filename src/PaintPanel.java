import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class PaintPanel extends JPanel {
    // array of 10000 java.awt.Point references
    private int pointCount = 0;
    private Point[] points = new Point[10000];

    public PaintPanel() {
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent event) {
                if (pointCount < points.length) {

                    points[pointCount] = event.getPoint(); // find point
                    ++pointCount; // increment number of points in array
                    repaint();
                }

            }
        });

    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent( g );
        for ( int i = 0; i < pointCount; i++ )
            g.fillOval(points[i].x ,points[i].y , 10, 10);
    }

}
