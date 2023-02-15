package resources.runners.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Bhavesh
 */
public class TestData {

    @DataProvider(name = "credentials")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                                            {"Admin", "admin123"},

        };
        return data;
    }



}
