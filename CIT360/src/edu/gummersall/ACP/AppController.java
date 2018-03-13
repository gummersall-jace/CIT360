package edu.gummersall.ACP;

import java.util.HashMap;

public class AppController {

	HashMap<String,Handler> handlerMap = new HashMap();

    public void handleRequest(String command) {
        Handler aCommandHandler = handlerMap.get(command);
        if (aCommandHandler != null){
            aCommandHandler.handleIt();
        }
    }

    public void mapCommand(String aCommand, Handler aHandler){
        handlerMap.put(aCommand,aHandler);
    }

}
