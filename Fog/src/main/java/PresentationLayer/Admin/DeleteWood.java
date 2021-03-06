package PresentationLayer.Admin;

import DBAccess.AdminFunctions;
import PresentationLayer.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

public class DeleteWood extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {

        int id = Integer.parseInt(request.getParameter("deleteId"));

        AdminFunctions.deleteWood(id);

        return "meterPris";
    }
}
