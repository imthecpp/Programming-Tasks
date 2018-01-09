

/**
 * Created by Dawid Kowalski on 09.11.2017.
 */
public class Converter {

    private long daysInYear_const = 365;
    private final long hoursInDay_const = 24;
    private  final long minSec_const = 60;
    private long yearsInSeconds;

    public void toSeconds(long year) {

        year *= daysInYear_const;
        System.out.print("rok = "+year);
        this.yearsInSeconds = (year *  hoursInDay_const);
        this.yearsInSeconds *= minSec_const * minSec_const;

        System.out.print("rok = "+this.yearsInSeconds);
    }
}
