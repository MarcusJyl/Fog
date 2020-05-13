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
        int height = Integer.parseInt(request.getParameter("senderHeight"));
//        int widthShed = Integer.parseInt(request.getParameter("senderWidthShed"));
//        int lengthShed = Integer.parseInt(request.getParameter("senderLengthShed"));
        System.out.println(height);
        int rem = length - 35;
        int hulbåndY = rem + 4;
        int hulbåndX = width - 55;
        int hulbåndStart = 55;
        int stolpeY = 35;
        double stolpeStørrelse = 9.7;
        double stolpeTop = 32.5;
        double stopeBund = length - 37.5;
        double træBredde = 4.5;


        HttpSession session = request.getSession();

        session.setAttribute("maxWidth", width);


        Svg svg = new Svg(600, 800, "0,0,600,800", 0, 0);
        Svg svgSide = new Svg(700,250, "0,0,700,250",0,0 );
        svg.addRect(0, 0, length, width);

       //Carport fra siden
        svgSide.addLine(0,0,length,10);
        svgSide.addLine(0,200,length,200);

        for (int x = 100; x <= width ; x+=310) {
            svgSide.addRect(x, stolpeTop,162.6 , stolpeStørrelse);
        }


        //Remme

        svg.addRect(0, stolpeY, træBredde, width );
        svg.addRect(0, rem, træBredde, width);
        //Spær

        for (int x = 0; x <= width ; x+=55) {
            svg.addSpær(x,0, length, træBredde);
        }

        //Hulbånd
        svg.addDottedLine(hulbåndStart, stolpeY, hulbåndX, hulbåndY);
        svg.addDottedLine(hulbåndStart, hulbåndY, hulbåndX, stolpeY);

        //Stolper
        for (int x = 100; x <= width ; x+=310) {
            svg.addRect(x, stolpeTop, stolpeStørrelse, stolpeStørrelse);
        }
        for (int x = 100; x <= width; x+=310) {
            svg.addRect(x, stopeBund, stolpeStørrelse, stolpeStørrelse);
        }

        //Pile


        request.setAttribute("svgdrawing", svg.toString());
        request.setAttribute("svgdrawingSide", svgSide.toString());
        return "../index";
    }


}
