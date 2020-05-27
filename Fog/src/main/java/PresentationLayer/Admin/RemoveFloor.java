package PresentationLayer.Admin;

import PresentationLayer.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RemoveFloor extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String floor = request.getParameter("floor");

        DBAccess.AdminFunctions.RemoveFloor(floor);

        return "Start";
    }
}
