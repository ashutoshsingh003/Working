package main;

/**
 * CreatedBy: Ashutosh Singh
 * Date: 15/11/17
 * Time: 1:36 PM
 */
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Do daily workout for atleast 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
