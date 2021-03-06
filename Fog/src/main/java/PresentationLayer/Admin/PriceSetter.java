package PresentationLayer.Admin;

import FunctionLayer.AdminFacade;
import PresentationLayer.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PriceSetter extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        double price = Double.parseDouble(request.getParameter("price"));

        AdminFacade.updateWoodPrice(id, price);
        return "meterPris";
    }
}
