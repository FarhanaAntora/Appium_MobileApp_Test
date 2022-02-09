import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner extends AppLaunch {
    TestCase testCase;

    @Test
    public void runTest() throws IOException, InterruptedException {
        testCase = new TestCase(driver);
        String result = testCase.openApp();
        Assert.assertEquals(result, "12");
    }
}





