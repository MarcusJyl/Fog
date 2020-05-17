package PresentationLayer;

import CarportBerninger.Carport;
import CarportBerninger.Util.ExcelMakker;
import FunctionLayer.LoginSampleException;

import javax.mail.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

public class ExcelMaker extends Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, UnsupportedEncodingException {

        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");

        int width = Integer.parseInt(request.getParameter("senderWidth"));
        int length = Integer.parseInt(request.getParameter("senderLength"));
        int height = Integer.parseInt(request.getParameter("senderHeight"));
        int lengthShed = Integer.parseInt(request.getParameter("senderLengthShed"));
        int slope = Integer.parseInt(request.getParameter("sendSlope"));
        boolean shedCheck = Boolean.parseBoolean(request.getParameter("senderCheckShed"));
        boolean shedCheckHalf = Boolean.parseBoolean(request.getParameter("senderCheckHalf"));
        boolean shedCheckWhole = Boolean.parseBoolean(request.getParameter("senderCheckWhole"));
        boolean fladtTag = Boolean.parseBoolean(request.getParameter("sendTag"));

        HttpSession session = request.getSession();
        session.setAttribute("send", "");

        Carport carport = new Carport(length,width,height, slope, lengthShed, shedCheck, shedCheckHalf, shedCheckWhole, fladtTag);
        ExcelMakker excel = new ExcelMakker(carport);
        try {
            excel.makeCarport(
                    "Kunde: " + name + "\nTelefonnummer: " + phone + "\n Mail: " + email,
                    width+", " + length + ", Kunde: " + name);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return "../index";
    }
}
