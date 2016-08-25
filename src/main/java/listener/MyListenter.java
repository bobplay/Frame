package listener;

import org.testng.IExecutionListener;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestResult;

import com.peilei.framework.Initproperties;



public class MyListenter implements IExecutionListener{


	public void onExecutionStart() {
		new Initproperties();
	}

	@Override
	public void onExecutionFinish() {
		// TODO Auto-generated method stub
		
	}

	
}
