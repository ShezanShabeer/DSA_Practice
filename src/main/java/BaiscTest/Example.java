package BaiscTest;

import java.time.LocalDate;
import java.util.Date;

public class Example {
    LocalDate end_date;
    String query;

    public Example(LocalDate end_date, String query){
        this.end_date = end_date;
        this.query = query;
    }

    public static String compare(Example ex, String input){
        LocalDate now = LocalDate.now();
        if(input != null){
            if(now.isAfter(ex.end_date) && input.equals(ex.query)){
                return input;
            }
        }
        return null;
    }
}
