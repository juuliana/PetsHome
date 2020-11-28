package Functions;

public class FormatDate {
    public String DefaultToSqlDate(String date){
        String[] dateSplitted = date.split("/");
        
        String dateFormated = dateSplitted[2] + "-" + dateSplitted[1] + "-" + dateSplitted[0];
        
        return dateFormated;
    }
    
    public String sqlDateToDefault(String date){
        String[] dateSplitted = date.split("-");
        
        String dateFormated = dateSplitted[2] + "/" + dateSplitted[1] + "/" + dateSplitted[0];
        
        return dateFormated;
    }
}
