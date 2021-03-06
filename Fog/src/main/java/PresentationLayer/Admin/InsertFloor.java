package PresentationLayer.Admin;

import PresentationLayer.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertFloor extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String floor = request.getParameter("floor");

        DBAccess.AdminFunctions.InsertFloor(floor);

        return "Start";
    }
}
