package exercises.PolygonR;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Polygon {

    private String name;
    private Point centerPoint;

    public Polygon(String name, Point centerPoint) {
        this.name = name;
        this.centerPoint = centerPoint;
    }

    public String getName() {
        return name;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }
    
    public void Paint() {
        
    }
}

