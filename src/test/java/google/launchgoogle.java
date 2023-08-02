package google;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class launchgoogle extends BaseClass{
@Test
public void mytest()
{
	driver.get("https://www.google.com/");
}


/*to declare the system as hub:-
java -jar path of selenium stand alone server -role hub
          |---------------------------------|


for more reference see the pics present on selenium grid_photes folder


//to declare a computer as a node
 
 java -Dwebdriver.chrome.driver="path of chrome or firefox driver .exe file path" -jar "selenium stand alone server file" -role node -port 555 -hub address of hub 
                                                                                                                                                    ----------------
                                                                                                      
                                                                                                                       
*/

}
