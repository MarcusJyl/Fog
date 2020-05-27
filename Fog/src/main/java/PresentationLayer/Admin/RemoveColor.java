package PresentationLayer.Admin;

import PresentationLayer.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RemoveColor extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String color = request.getParameter("color");

        DBAccess.AdminFunctions.RemoveColor(color);

        return "Start";
    }
}
