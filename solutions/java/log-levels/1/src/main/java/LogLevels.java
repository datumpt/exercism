public class LogLevels {
    
    public static String message(String logLine) {
        String[] arr1 = logLine.split(": ");
        return arr1[1].strip();
    }

    public static String logLevel(String logLine) {
        String[] arr1 = logLine.split(": ");
        
        return arr1[0]
            .replace("[", "")
            .replace("]", "")
            .strip()
            .toLowerCase();
    }

    public static String reformat(String logLine) {
        String level = logLevel(logLine); 
        return message(logLine)
            .concat(" (")
            .concat(level)
            .concat(")");
    }
}
