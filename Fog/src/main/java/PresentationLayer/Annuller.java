package PresentationLayer;

import FunctionLayer.LoginSampleException;

import javax.mail.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

public class Annuller extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, UnsupportedEncodingException {

        HttpSession session = request.getSession();

        session.setAttribute("send", "");

        return "../index";
    }
}
