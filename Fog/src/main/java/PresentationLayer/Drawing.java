package PresentationLayer;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Svg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Drawing extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        int width = Integer.parseInt(request.getParameter("senderWidth"));
        int length = Integer.parseInt(request.getParameter("senderLength"));
        int rem = width - 35;
        int krydsY = rem + 4;
        int krydsX = length - 55;
        int stolpe = width - 35;




        HttpSession session = request.getSession();

        session.setAttribute("maxWidth", width);


        Svg svg = new Svg(800, 600, "0,0,800,600", 0, 0, 0, 0);
        svg.addRect(0, 0, width, length);
        //Remme
        svg.addRect(0, 35, 4, length);
        svg.addRect(0, rem, 4, length);
        //Spær
        svg.addRect(0,0,width,4);
        svg.addRect(length, 0, width, 4);
        //Kryds
        svg.addCross(55, 35, krydsX, krydsY);
        svg.addCross(55, krydsY, krydsX, 35);
        //Stolper
        svg.addRect(110, 32, 10,10);
        svg.addRect(110, stolpe, 10,10);





        request.setAttribute("svgdrawing", svg.toString());
        return "../index";
    }
}
