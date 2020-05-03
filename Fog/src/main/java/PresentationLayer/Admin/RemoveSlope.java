package PresentationLayer.Admin;

import FunctionLayer.LoginSampleException;
import PresentationLayer.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RemoveSlope extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        String slope = request.getParameter("slope");
        int i = Integer.parseInt(slope);
        DBAccess.AdminFunctions.RemoveSlope(i);

        return "Start";
    }
}
