package PresentationLayer;

import FunctionLayer.LoginSampleException;
import PresentationLayer.Admin.ReturnBasicMeasurements;
import PresentationLayer.Admin.ReturnRoofsAndFloors;
import PresentationLayer.Admin.ReturnShed;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "widthSetter", new WidthSetter() );
        commands.put( "draw", new Drawing() );
        commands.put("returnBasicMeasurements", new ReturnBasicMeasurements());
        commands.put("returnShed", new ReturnShed());
        commands.put("returnRoofsAndFloors", new ReturnRoofsAndFloors());
    }

    static Command from( HttpServletRequest request ) {
        String TagetName = request.getParameter( "taget" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(TagetName, new UnknownCommand() );   // unknowncommand er default.
    }

    public abstract String execute(HttpServletRequest request, HttpServletResponse response)
            throws LoginSampleException;

}
