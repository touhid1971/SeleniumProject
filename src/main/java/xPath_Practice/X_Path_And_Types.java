package xPath_Practice;

public class X_Path_And_Types {

	public static void main(String[] args) {
		
		/* There are two types of x-path:
		 * 		Absolute x-Path
		 * 		Relative x-Path
		
		
			Absulot X-path starts with single slash (/)
					/html/body/div[6]/div........../td[i]/input
		
		
			Relative X-Path
			Starts with double slash (//)
			
			1) Attribute base Xpath
				Syntex: //tagname[@attribute='value']
			
			2) Partial Attribute Xpath
				Syntex: //tagname[contains(@attribute,'partial value')]
			
			3) Text base Xpath
				Syntex: //tagname[text()='text']
			4) Partial text base Xpath
				Syntex: //tagname[contains(text(),'text')]
				
			5) Parent to Child navigation/travel
				Syntex: Parent base xpath/child tagname
					ex:	//input[@id='username']/li
					
			6) Collections Xpath: (Index Mendatory)
			
				Syntex: (//tagname[@attribute='value']/child tag)[index]
						(//div[@class='x-grid...........']/a)[3]
						
			7) Handling Dyunamic Webelement
				a) Start-with (value start with text)
				Syntex: //tagname[starts-with(@attribute,'start value of attribute')]
				
				b) Contains (Value start wiht number)
				Syntex: //tagname[contains(@attribute,'end value of attribute)]
		 */

	}

}
