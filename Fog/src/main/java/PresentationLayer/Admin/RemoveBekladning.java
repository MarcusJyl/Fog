package PresentationLayer.Admin;

import PresentationLayer.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RemoveBekladning extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        String bekladning = request.getParameter("bekladning");

        DBAccess.AdminFunctions.RemoveBekladning(bekladning);

        return "Start";
    }
}
