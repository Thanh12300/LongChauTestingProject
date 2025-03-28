package pages


import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
















public class HomePage {

	private TestObject searchBar = ObjectRepository.findTestObject('Object Repository/HomePage/inputKeyword')
	private TestObject btnImageSearch = ObjectRepository.findTestObject('Object Repository/HomePage/buttonImageSearch')
	private TestObject uploadImage = ObjectRepository.findTestObject('Object Repository/HomePage/uploadImage')
	private TestObject btnSearchImage = ObjectRepository.findTestObject('Object Repository/HomePage/btnSearchImage')
	
	
	HomePage() {}

	public void enterSearchKeyword(String keyword) {
		WebUI.setText(searchBar, keyword)
	}

	public void pressEnter() {
		WebUI.sendKeys(searchBar, Keys.chord(Keys.ENTER))
	}

	public void searchProductByKeyword(String keyword) {
		enterSearchKeyword(keyword)
		pressEnter()
		WebUI.delay(2)
	}
	
	public void uploadImage(String imagePath) {
		WebUI.uploadFile(uploadImage, imagePath)
	}
	
	public void searchProductByImage(String imagePath) {
		WebUI.click(btnImageSearch)
		uploadImage(imagePath)
		WebUI.click(btnSearchImage)
		
	}
}
