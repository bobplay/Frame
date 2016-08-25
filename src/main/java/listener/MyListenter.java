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

<<<<<<< HEAD
=======



>>>>>>> 75fe5fe7b7906cc55df867a1b1db5015e8a16f62
	
}
