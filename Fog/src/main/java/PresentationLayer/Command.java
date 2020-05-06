package PresentationLayer;

import FunctionLayer.LoginSampleException;
import PresentationLayer.Admin.*;


import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "widthSetter", new WidthSetter() );
        commands.put( "draw", new Drawing() );
        commands.put("insertHeight", new InsertHeight());
        commands.put("insertLength", new InsertLength());
        commands.put("insertWidth", new InsertWidth());
        commands.put("insertSlope", new InsertSlope());
        commands.put("insertShedWidth", new InsertShedWidth());
        commands.put("insertShedLength", new InsertShedLength());
        commands.put("insertBekladning", new InsertBekladning());
        commands.put("insertFloor", new InsertFloor());
        commands.put("insertColor", new InsertColor());
        commands.put("insertRoof", new InsertRoof());
        commands.put("removeRoof", new RemoveRoof());
        commands.put("removeColor", new RemoveColor());
        commands.put("removeFloor", new RemoveFloor());
        commands.put("removeBekladning" , new RemoveBekladning());
        commands.put("removeHeight", new RemoveHeight());
        commands.put("removeLength", new RemoveLength());
        commands.put("removeSlope", new RemoveSlope());
        commands.put("removeWidth", new RemoveWidth());
        commands.put("removeShedLength", new RemoveShedLength());
        commands.put("removeShedWidth", new RemoveShedWidth());
        commands.put("returnBasicMeasurements", new ReturnBasicMeasurements());
        commands.put("returnShed", new ReturnShed());
        commands.put("returnRoofsAndFloors", new ReturnRoofsAndFloors());
        commands.put("adminSide", new AdminSide());
        commands.put("returnMeterPris", new ReturnMeterPrice());
        commands.put("priceSetter", new PriceSetter());
    }

    static Command from( HttpServletRequest request ) {
        String TagetName = request.getParameter( "taget" );
        System.out.println(TagetName);
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(TagetName, new UnknownCommand() );   // unknowncommand er default.
    }

    public abstract String execute(HttpServletRequest request, HttpServletResponse response)
            throws LoginSampleException;

}
