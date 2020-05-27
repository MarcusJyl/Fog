package PresentationLayer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class WidthSetter extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        int maxWidth = Integer.parseInt(request.getParameter("senderWidth"));

        HttpSession session = request.getSession();

        session.setAttribute("maxWidth", maxWidth);

        return "../index";
    }
}
