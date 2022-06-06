import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest{

    //variables
    private int year;
    private int month;
    private int day;

    //Setter
    public DateNextDateExceptionTest(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    
    @Parameters //Les tests qui seront effectués
    public static List<Integer[]> data(){
        List<Integer[]> parameters = new LinkedList<Integer[]>();
        parameters.add(new Integer[] {4356, 13, 4});
        parameters.add(new Integer[] {400, 1, 32});
        parameters.add(new Integer[] {-1, 11, 30});
        parameters.add(new Integer[] {1, -11, 3});
        parameters.add(new Integer[] {1000, 4, -3});
        return parameters;
    }

    @Test //La commande des tests
    public void NextDateExceptionTest(){
        Assert.assertThrows(IllegalArgumentException.class, () -> new Date(year,month,day));
    }

}
