package Model;

import java.text.SimpleDateFormat;

public class ApplicationDate {
    
    public static String convertUtilDatetoString(java.util.Date utilDate)
    {
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        return dateformat.format(utilDate);
    }
}
