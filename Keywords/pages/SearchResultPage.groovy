package pages

import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI






public class SearchResultPage {
	private TestObject textSearchResult = ObjectRepository.findTestObject('Object Repository/SearchResultPage/textSearchResult')


	SearchResultPage() {}

	public boolean checkSearchResults() {
		return WebUI.verifyElementPresent(textSearchResult, 5)
	}
}
