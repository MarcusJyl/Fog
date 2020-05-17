package PresentationLayer.Admin;

import DBAccess.AdminFunctions;
import FunctionLayer.LoginSampleException;
import PresentationLayer.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

public class WoodAdder extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, UnsupportedEncodingException {

        String name = request.getParameter("name");

        double itemnumber = Double.parseDouble(request.getParameter("itemnumber"));
        double length = Double.parseDouble(request.getParameter("length"));
        double width = Double.parseDouble(request.getParameter("width"));
        double depth = Double.parseDouble(request.getParameter("depth"));
        double price = Double.parseDouble(request.getParameter("price"));

        for (String s :AdminFunctions.selectAllWoodNames()){
            if (name.equals(s)){
                AdminFunctions.insertWood(name,(int)itemnumber,length,width,depth,price, false);
                return "meterPris";
            }
        }

        AdminFunctions.insertWood(name,(int)itemnumber,length,width,depth,price, true);

        return "meterPris";
    }
}
