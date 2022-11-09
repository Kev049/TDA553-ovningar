import javax.swing.*;
import java.awt.*;
import java.util.*;

public class DrawPolygons extends Component{
    private ArrayList<String> polygonNames;
    private ArrayList<Point>  centerPoints;
    private int offset = 10;

    public DrawPolygons(){
        polygonNames = new ArrayList<>(offset);
        centerPoints = new ArrayList<>(offset);
                                      
        polygonNames.add("square");
        //polygonNames.add("quadrilateral with four equal sides and four right angles")
        polygonNames.add("triangle");
        polygonNames.add("rectangle");

        centerPoints.add(new Point(100,100));
        centerPoints.add(new Point(150,150));
        centerPoints.add(new Point(100,200));
    }//constructor

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < polygonNames.size(); i++) {
            String currentPolygon = polygonNames.get(i);
            Point currentCenter = centerPoints.get(i);
            if (currentPolygon.equals("square")) {
                g.drawRect(currentCenter.x -offset, currentCenter.y -offset, 2*offset, 2*offset); 
            } else if (currentPolygon.equals("triangle")) {
                drawTriangle(g, currentCenter);
            } else if (currentPolygon.equals("rectangle"))
                g.drawRect(currentCenter.x -20, currentCenter.y -offset, 40, 20);
        }
    }//paint

    private void drawTriangle(Graphics g, Point currentCenter) {
        g.drawLine(currentCenter.x, currentCenter.y-offset, currentCenter.x-offset, currentCenter.y+offset);
        g.drawLine(currentCenter.x-offset, currentCenter.y+offset, currentCenter.x+offset, currentCenter.y+offset);
        g.drawLine(currentCenter.x+offset, currentCenter.y+offset, currentCenter.x, currentCenter.y-offset);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);

    }//main

}//DrawPolygons