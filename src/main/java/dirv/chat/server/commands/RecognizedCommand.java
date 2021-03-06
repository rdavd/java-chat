package dirv.chat.server.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class RecognizedCommand implements Command {
    
    private final String commandType;

    protected RecognizedCommand(String commandType) {
        this.commandType = commandType;
    }
    
    public boolean respondsTo(String commandType) {
        return this.commandType.equals(commandType);
    }

    public abstract void execute(BufferedReader reader, PrintWriter printWriter) throws IOException;
}
