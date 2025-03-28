import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import pages.HomePage

'1. Navigate to url'
WebUI.navigateToUrl(GlobalVariable.baseURL)

'2. Upload image'
String projectPath = RunConfiguration.getProjectDir()
String imagePath = projectPath + "/Data Files/images/srm.png"
HomePage homepage = new HomePage()
homepage.searchProductByImage(imagePath)

