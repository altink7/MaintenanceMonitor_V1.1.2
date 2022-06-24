package unitTests;
import fh.slm.maintenancemonitor_v1_1_2.Monitor.Monitor;
import org.junit.*;

public class ControllerTests {


    @Test //this Test gets the variable and compares it
    public void testGetStatus(){
        Monitor.setStatus("-"); // Reset the RestAPI message

        String s = Monitor.getStatus();//actual
        String excepted = "-";//excepted

        Assert.assertEquals("Should be \"-\" ",excepted,s);
    }

    @Test //This Test sets the Status and tests the setMethod
    public void testSetStatus(){
        Monitor.setStatus("test");

        String s = Monitor.getStatus();//actual
        String excepted = "test";//excepted

        Assert.assertEquals("Should be \"Test\" ",excepted,s);

    }

    @Test //This Test sets the Status with Null Value and tests the setMethod
    public void testSetStatusNull(){
        Monitor.setStatus(null);

        String s = Monitor.getStatus();//actual
        String excepted = "-";//excepted

        Assert.assertEquals("Should be \"-\" ",excepted,s);
    }

    @Test //This Test sets the Status with Blank Value and tests the setMethod
    public void testSetStatusBlank(){
        Monitor.setStatus("");

        String s = Monitor.getStatus();//actual
        String excepted = "-";//excepted

        Assert.assertEquals("Should be \"-\" ",excepted,s);
    }

}