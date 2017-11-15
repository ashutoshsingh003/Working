package main;

/**
 * CreatedBy: Ashutosh Singh
 * Date: 15/11/17
 * Time: 1:35 PM
 */
public class BaseBallCoach  implements Coach{

    //define a private field for the dependecy

    private FortuneService fortuneService;

    //define a constructor for dependency injection

    public BaseBallCoach(FortuneService theFortuneService){

        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Spend at least 30 minutes for daily workout";
    }

    @Override
    public String getDailyFortune() {
        //use my fortune service to get  daily fortune

        return fortuneService.getFortune();
    }
}
