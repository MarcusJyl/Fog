package PresentationLayer.Admin;

import PresentationLayer.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertRoof extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String roof = request.getParameter("roof");

        DBAccess.AdminFunctions.InsertRoof(roof);

        return "Start";
    }
}
