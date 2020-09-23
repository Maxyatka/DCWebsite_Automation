package Test_Suite_1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Suite 1 - 25 Test Cases")
@SelectPackages({
        "Test_Suite_1.Tests.MainPage",
        "Test_Suite_1.Tests.DropdownMenuTopNavBar"
})
public class Test_Suite_1 {
}