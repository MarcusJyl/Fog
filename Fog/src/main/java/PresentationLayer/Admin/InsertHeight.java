package PresentationLayer.Admin;

import PresentationLayer.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InsertHeight extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        String height = request.getParameter("height");
        int i = Integer.parseInt(height);
        DBAccess.AdminFunctions.InsertHeight(i);

        return "Start";

    }
}
