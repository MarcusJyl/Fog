package PresentationLayer.Admin;

import PresentationLayer.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertShedWidth extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String width = request.getParameter("width");

        int i = Integer.parseInt(width);
        DBAccess.AdminFunctions.InsertShedWidth(i);

        return "Start";
    }
}
