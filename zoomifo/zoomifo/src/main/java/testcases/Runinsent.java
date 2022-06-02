package testcases;

import org.testng.annotations.Test;

import Baseclass.baseclass;
import pages.chatbotgreen;

public class Runinsent  extends baseclass
{

		@Test
	public void runtestcases() throws InterruptedException

	{
		
			chatbotgreen cg=new chatbotgreen();
	cg.green().email().number().rating().restart();

			
			
			
	}
}
