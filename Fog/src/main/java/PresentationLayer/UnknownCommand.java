package PresentationLayer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *Meningen med den commando er at hvis der fra jsp side bliver kladet på en fil der ikke er i command klassen ville denne fejl komme
 */
public class UnknownCommand extends Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String msg = "Unknown command. Contact IT";
        throw new Exception( msg );
    }

}
