package PresentationLayer.Admin;

import PresentationLayer.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReturnShed extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "shed";

    }
}
