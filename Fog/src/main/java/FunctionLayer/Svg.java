package FunctionLayer;

import PresentationLayer.Drawing;
import com.sun.javafx.binding.StringFormatter;

import java.util.Locale;

/**
 * Denne klasse holder på alle methoder til at tegne svg tegningen med.
 */

public class Svg {

    private int width1;
    private int height1;
    private String viewbox;
    private int x;
    private int y;
    private StringBuilder svg = new StringBuilder();
    private StringBuilder svgText = new StringBuilder();
    String svgTextHeader;

    private final String headerTemplate = "<svg version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" height=\"%s\" width=\"%s\" viewBox=\"%s\" preserveAspectRatio=\"xMinYMin\">";
    private final String headerTemplate2 ="<svg version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" viewBox=\"%s\" preserveAspectRatio=\"xMinYMin\">";
    private final String rectTemplate = "<rect x=\"%f\" y=\"%f\" height=\"%f\" width=\"%f\" style=\"stroke:#000000; fill: #ffffff\" />";
    private final String dottedLineTemplate = "<line x1=\"%d\" y1=\"%d\" x2=\"%d\" y2=\"%d\" style=\"stroke:#000000; stroke-dasharray: 5 5;\" />";
    private final String beklædningLineTemplate = "<rect x=\"%d\" y=\"%f\" height=\"%f\" width=\"%f\" style=\"stroke:#000000; fill: #ffffff; stroke-width: 2; stroke-dasharray: 5;\" />";
    private final String lineTemplate = "<line x1=\"%d\" y1=\"%d\" x2=\"%d\" y2=\"%d\" style=\"stroke:#000000; fill: #ffffff\" />";


    public Svg(int width, int height, String viewbox, int x, int y) {
        this.width1 = width;
        this.height1 = height;
        this.viewbox = viewbox;
        this.x = x;
        this.y = y;

        svg.append(String.format(Locale.US, headerTemplate, height, width, String.format(viewbox,width, height)));
        svgTextHeader = String.format(Locale.US, headerTemplate2, String.format(viewbox, width + 50, height + 50));

    }

    public void addRect(double x, double y, double width, double height){
        svg.append(String.format(Locale.US, rectTemplate, x, y, width, height));
    }

//    public void addSpær(int x, double y, double height, double width){
//            svg.append(String.format(rectTemplate, x, y, height, width));
//    }

    public void addDottedLine(int x1, int y1, int x2, int y2){
        svg.append(String.format(Locale.US, dottedLineTemplate, x1, y1, x2, y2));
    }

    public void addBeklædningDottedLine(int x1, double y1, double width1, double height1){
        svg.append(String.format(Locale.US, beklædningLineTemplate, x1, y1, width1, height1));
    }

    public void addLine(int x1, int y1, int x2, int y2){
        svg.append(String.format(lineTemplate, x1, y1, x2, y2));
    }

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
        return svgTextHeader + svg.toString() + "</svg>" + svgText.toString() + "</svg>";
    }
}