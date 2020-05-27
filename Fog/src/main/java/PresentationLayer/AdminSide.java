package PresentationLayer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminSide extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "Start";
    }
}
