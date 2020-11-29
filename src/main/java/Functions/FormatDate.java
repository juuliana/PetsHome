package Functions;

public class FormatDate {
    public static String DefaultToSqlDate(String date){
        String[] dateSplitted = date.split("/");
        
        String dateFormated = dateSplitted[2] + "-" + dateSplitted[1] + "-" + dateSplitted[0];
        
        return dateFormated;
    }
    
    public static String sqlDateToDefault(String date){
        String[] dateSplitted = date.split("-");
        
        String dateFormated = dateSplitted[2] + "/" + dateSplitted[1] + "/" + dateSplitted[0];
        
        return dateFormated;
    }
}
