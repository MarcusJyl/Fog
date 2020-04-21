package PresentationLayer;

import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class WidthSetter extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

        int maxWidth = Integer.parseInt(request.getParameter("widthSetterWidth"));

        HttpSession session = request.getSession();

        session.setAttribute("maxWidth", maxWidth);

        return "../index";
    }
}
