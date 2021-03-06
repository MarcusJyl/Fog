package PresentationLayer.Admin;

import PresentationLayer.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertSlope extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String slope = request.getParameter("slope");

        int i = Integer.parseInt(slope);
        DBAccess.AdminFunctions.InsertSlope(i);

        return "Start";
    }
}
