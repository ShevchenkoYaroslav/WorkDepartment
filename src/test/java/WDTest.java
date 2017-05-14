import org.junit.AfterClass;
import service.WDServiceImpl;

/**
 * Created by Valsorya94 on 12.05.2017.
 */
public class WDTest {

    private static WDServiceImpl service;

    @AfterClass
    public static void tearDown() throws Exception {
        service.closeDBConnection();
    }

}
