package exercises.PolygonR;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class DrawPolygons extends Component{
    private ArrayList<Polygon> polygons;

    private ArrayList<String> polygonNames;
    private ArrayList<Point>  centerPoints;

    public DrawPolygons(){
        polygons = new ArrayList<>(10);
    
        polygons.add(new Polygon("square", new Point(100,100)));
        polygons.add(new Polygon("triangle", new Point(150,150)));
        polygons.add(new Polygon("rectangle", new Point(100,200)));
    }//constructor

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < polygons.size(); i++) {
            Polygon currentPolygon = polygons.get(i);
            String currentName = currentPolygon.getName();
            Point currentCenter = currentPolygon.getCenterPoint();
            if (currentName.equals("square"))
                g.drawRect(currentCenter.x -10, currentCenter.y -10, 20, 20);
            else if (currentPolygon.equals("triangle")) {
                g.drawLine(currentCenter.x, currentCenter.y-10, currentCenter.x-10, currentCenter.y+10);
                g.drawLine(currentCenter.x-10, currentCenter.y+10,
                        currentCenter.x+10, currentCenter.y+10);
                g.drawLine(currentCenter.x+10, currentCenter.y+10, currentCenter.x, currentCenter.y-10);
            } else if (currentPolygon.equals("rectangle"))
                g.drawRect(currentCenter.x -20, currentCenter.y -10, 40, 20);
        }
    }//paint

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);

    }//main

}//DrawPolygons