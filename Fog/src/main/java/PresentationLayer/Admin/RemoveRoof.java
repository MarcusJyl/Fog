package PresentationLayer.Admin;

import PresentationLayer.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RemoveRoof extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String roof = request.getParameter("roof");

        DBAccess.AdminFunctions.RemoveRoof(roof);

        return "Start";
    }
}
