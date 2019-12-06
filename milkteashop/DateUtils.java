package milkteashop;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    public static Boolean calculateDay( Calendar product ,int day) {
        Date productDate = product.getTime();
        Date currentDate = new Date();
        return (currentDate.getTime() - productDate.getTime())
                / (24 * 60 * 60 * 1000)-day>0;
    }


}
