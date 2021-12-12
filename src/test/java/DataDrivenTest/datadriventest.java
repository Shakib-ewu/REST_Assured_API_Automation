package DataDrivenTest;

import org.testng.annotations.DataProvider;

public class datadriventest {
	@DataProvider(name= "dataForPost")
	public Object[][] dataForPost()
	{
		return new Object[][] {
			{"ALex","Carey",1},
			{"Tomash","Tuchel",2},
			{"Pep","Xavi",2}
				
				
			};
	}
			
			@DataProvider(name="DeleteData")
			public Object[] dataForDelete() {
				
			return new Object[] {
					4,5

			};

}
	}
