package FunctionLayer;

import PresentationLayer.Drawing;
import com.sun.javafx.binding.StringFormatter;

public class Svg {

    private int width1;
    private int height1;
    private String viewbox;
    private int x;
    private int y;
    private StringBuilder svg = new StringBuilder();


    private final String headerTemplate = "<svg version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" height=\"%s\" width=\"%s\" viewBox=\"%s\" preserveAspectRatio=\"xMinYMin\">";
    private final String rectTemplate = "<rect x=\"%d\" y=\"%d\" height=\"%f\" width=\"%f\" style=\"stroke:#000000; fill: #ffffff\" />";
    private final String crossTemplate = "<line x1=\"%d\" y1=\"%d\" x2=\"%d\" y2=\"%d\" style=\"stroke:#000000; stroke-dasharray: 5 5;\" />";

<<<<<<< HEAD
    public Svg(int width, int height, String viewbox, int x, int y, int x2, int y2) {
        this.width1 = width;
        this.height1 = height;
=======

        this.viewbox = viewbox;
        this.x = x;
        this.y = y;
        svg.append(String.format(headerTemplate, height, width, viewbox));
    }

    public void addRect(int x, int y, double height, double width){
        svg.append(String.format(rectTemplate, x, y, height, width));
    }
    public void addSpær(int x, int y, double height, double width){
            svg.append(String.format(rectTemplate, x, y, height, width));

    }

    public void addCross(int x1, int y1, int x2, int y2){
        svg.append(String.format(crossTemplate, x1, y1, x2, y2));
    }

//    public void addSpær(int y, double length, int width){
//        for(int i = 0; i < length; i+=55){
//            svg.append(String.format(rectTemplate, i, y, length, width));
//
//        }
//    }


    public int getWidth() {
        return width1;
    }

    public void setWidth(int width) {
        this.width1 = width;
    }

    public int getHeight() {
        return height1;
    }

    public void setHeight(int height) {
        this.height1 = height;
    }

    public String getViewbox() {
        return viewbox;
    }

    public void setViewbox(String viewbox) {
        this.viewbox = viewbox;
    }

    public int getX() { return x; }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return svg.toString() + "</svg>" ;
    }
}