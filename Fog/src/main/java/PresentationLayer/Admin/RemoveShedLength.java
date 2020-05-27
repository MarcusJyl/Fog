package PresentationLayer.Admin;

import PresentationLayer.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RemoveShedLength extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String length = request.getParameter("length");
        int i = Integer.parseInt(length);
        DBAccess.AdminFunctions.RemoveShedLength(i);

        return "Start";
    }
}
