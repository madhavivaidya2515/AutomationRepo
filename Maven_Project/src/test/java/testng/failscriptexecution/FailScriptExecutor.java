package testng.failscriptexecution;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//import static jdk.internal.net.http.PlainHttpConnection.ConnectState.RETRY;

public class FailScriptExecutor implements IRetryAnalyzer {

    public static  long MIN_VALUE = 0;

    public static final long RETRY = 3;

    @Override
    public boolean retry(ITestResult iTestResult){
        while (MIN_VALUE < RETRY){
            MIN_VALUE++;
            return true;
        }
        return false;
    }
}

