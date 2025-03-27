package pages

import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI






public class SearchResultPage {
	private TestObject productTitles = ObjectRepository.findTestObject('Object Repository/SearchResultPage/textProductTitle')
	
	SearchResultPage() {}
	
	public boolean checkSearchResults(String keyword) {
		List<WebElement> products  = WebUI.findWebElements(productTitles, 10)
		
		for (WebElement product : products ) {
			String title = product.getText().trim()
			KeywordUtil.logInfo("-" + title)
			if (!title.toLowerCase().contains(keyword.toLowerCase())) {
				return false
			}
		}
		return true
	}
	
}
