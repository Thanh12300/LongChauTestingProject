package pages


import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
















public class HomePage {

    private TestObject searchBar = ObjectRepository.findTestObject('Object Repository/HomePage/inputKeyword')

	
	HomePage() {}
	
	public void enterSearchKeyword(String keyword) {
		WebUI.setText(searchBar, keyword)
	}
	
	public void pressEnter() {
		WebUI.sendKeys(searchBar, Keys.chord(Keys.ENTER))

	}
	
	public void searchProduct(String keyword) {
		enterSearchKeyword(keyword)
		pressEnter()
		WebUI.delay(2)
	}
}
