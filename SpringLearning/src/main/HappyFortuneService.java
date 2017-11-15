package main;

/**
 * CreatedBy: Ashutosh Singh
 * Date: 15/11/17
 * Time: 1:30 PM
 */
public class HappyFortuneService implements FortuneService{

    FortuneService fortuneService;

    @Override
    public String getFortune() {
        return "Hello World,Learning Spring step by step";
    }
}
