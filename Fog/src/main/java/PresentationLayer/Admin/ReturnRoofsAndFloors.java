package PresentationLayer.Admin;

import PresentationLayer.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReturnRoofsAndFloors extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "RoofsAndFloors";
    }
}