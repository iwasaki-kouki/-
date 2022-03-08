import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingApp{
    public static void main (String[] args){
        Logger logger =Logger.getLogger(LoggingApp.class.getName());
            logger.setLevel(Level.ALL);
            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setLevel(Level.ALL);
            logger.addHandler(consoleHandler);
            logger.setUseParentHandlers(false);
            try{
            logger.info("try");
            Integer.parseInt(args[0]);
            } catch (Exception e){
            logger.severe("catch");
            }finally{
            logger.finest("finally");
            System.out.println("要素の出力を終了します。");
            }
    }
}