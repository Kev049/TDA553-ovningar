package DIT953.polygonModel.polygon;

import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
class Rectangle extends Polygon {
    Rectangle(int x, int y) {
        super(x,y);
    }

    public void paint(Graphics g){
        g.drawRect(centerPoint.x -20, centerPoint.y -10, 40, 20);
    }
}
