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


        HttpSession session = request.getSession();

        session.setAttribute("maxWidth", width);


        Svg svg = new Svg(800, 600, "0,0,800,600", 0, 0);
        svg.addRect(0, 0, length, width);

        request.setAttribute("svgdrawing", svg.toString());
        return "../index";
    }
}
