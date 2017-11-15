package main;

/**
 * CreatedBy: Ashutosh Singh
 * Date: 15/11/17
 * Time: 1:36 PM
 */
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Run fast upto 5k";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
