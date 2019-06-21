package test;

import app.CalculTOR;
import app.DateTool;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

public class CalculTORTest {
    int firstNum = 8;
    int secondNum = 4;
    int thirdNum = 0;
    @Test
    public void calculationsTest(){
        Assert.assertEquals(12, CalculTOR.addNumbers(firstNum,secondNum));
        Assert.assertEquals(4, CalculTOR.subNumbers(firstNum,secondNum));
        Assert.assertEquals(2, CalculTOR.divNumbers(firstNum,secondNum));
        Assert.assertEquals(32, CalculTOR.multiNumbers(firstNum,secondNum));
    }
    @Test
    public void negativeCalculatorTest(){
        Assert.assertNotEquals(11, CalculTOR.addNumbers(firstNum,secondNum));
    }

    @Test
    public void formatDatesTest() {
        Date resultDate;

        int hoursToAdd = 1;
        int minutesToAdd = 30;
        int dayToAdd = 1;
        resultDate= DateTool.addHoursToNow(hoursToAdd);
        System.out.println(resultDate);

        resultDate=DateTool.addMinuteToNow(minutesToAdd);
        System.out.println(resultDate);

        resultDate=DateTool.addDayToNow(dayToAdd);
        System.out.println(resultDate);
    }
}
