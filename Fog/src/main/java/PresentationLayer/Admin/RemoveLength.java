package PresentationLayer.Admin;

import FunctionLayer.LoginSampleException;
import PresentationLayer.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RemoveLength extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        String length = request.getParameter("length");
        int i = Integer.parseInt(length);
        DBAccess.AdminFunctions.RemoveLength(i);

        return "../index";
    }
}
