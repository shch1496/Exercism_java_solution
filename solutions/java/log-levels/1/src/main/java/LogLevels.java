public class LogLevels {
    
    public static String message(String logLine) {
       int colonSymbol = logLine.indexOf(":");
       return logLine.substring(colonSymbol+1).trim();
    }

    public static String logLevel(String logLine) {

       int beginBracket = logLine.indexOf("[");
       int closeBracket = logLine.indexOf("]");
       return logLine.substring(beginBracket+1, closeBracket).trim().toLowerCase();
    }

    public static String reformat(String logLine) {

        String msg = message(logLine);
        String level = logLevel(logLine);
        return msg + " (" + level +")";
    }
}
