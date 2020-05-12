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
        int rem = length - 35;
        int krydsY = rem + 4;

        int krydsX = width - 55;
        int stolpe = length - 35;

        double lineWidth = 4.5;
        System.out.println(length);

        int StopleY = 35;




        HttpSession session = request.getSession();

        session.setAttribute("maxWidth", width);


        Svg svg = new Svg(800, 600, "0,0,800,600", 0, 0, 0, 0);
        svg.addRect(0, 0, length, width);
        //Remme
        svg.addRect(0, StopleY, lineWidth, width );
        svg.addRect(0, rem, lineWidth, width);
        //Spær
        for(int i = 0; i < width; i+= 55){
            svg.addRect(i, 0, length , lineWidth);
        }
//        svg.addRect(0,0,width,4);
//        svg.addRect(length, 0, width, 4);


        //Kryds
        svg.addCross(55, StopleY, krydsX, krydsY);
        svg.addCross(55, krydsY, krydsX, 35);
        //Stolper
        svg.addRect(110, 32, 10,10);
        svg.addRect(110, stolpe, 10,10);



        request.setAttribute("svgdrawing", svg.toString());
        return "../index";
    }


}
