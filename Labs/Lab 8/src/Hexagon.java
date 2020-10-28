/*
 * Author: Austin Lynn
 * User: auslynn
 * Last Updated: 4/8/20
 */

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Hexagon extends Polygon {
    private int sideLength;

    public Hexagon(Color fillColor, Color borderColor, int x, int y, int sideLength) {
        super(fillColor, borderColor, x, y, getHexPoints(x, y, sideLength));
        this.sideLength=sideLength;
    }

    private static List<Point> getHexPoints(int x, int y, int sideLength) {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            points.add(new Point((int) (y + sideLength * Math.sin(i * 2 * Math.PI / 6)),
                    (int) (x + sideLength * Math.cos(i * 2 * Math.PI / 6))));
        }

        return points;
    }

    public String toString()
    {
    	return "Shape Name: Hexagon | Side Length: " +sideLength;
    }

    @Override
    double getArea() 
    {
        return 3.0 / 2.0 * Math.pow(sideLength, 2) * Math.sqrt(3);
    }

    @Override
    double getPerimeter() 
    {
        return sideLength * 6;
    }
    
    @Override
    boolean touchingPerim(int x, int y) 
    {
        int num = (int) (((double) sideLength) / (2.0 * Math.tan(180.0/5)));
        return getX() - 2 * num <= 0 || getX() + num >= x || getY() - 2 * num <= 0 || getY() + 2 * num >= y;
    }
    
    @Override
    Shape collision(int moveX2, int moveY2) {
        Hexagon hexagon = new Hexagon(getFillColor(), getBorderColor(), getX(), getY(), sideLength * (int) Math.sqrt(2));
        hexagon.setMoveX(moveX2);
        hexagon.setMoveY(moveY2);
        return hexagon;
    }
    
    @Override
    public List<Point> points() {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            points.add(new Point((int) (getX() + sideLength * Math.cos(i * 2 * Math.PI / 6)),
                    (int) (getY() + sideLength * Math.sin(i * 2 * Math.PI / 6))));
        }

        return points;
    }
}
