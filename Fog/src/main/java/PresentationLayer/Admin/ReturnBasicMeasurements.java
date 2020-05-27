package PresentationLayer.Admin;

import PresentationLayer.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReturnBasicMeasurements extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "basicMeasurements";
    }
}

