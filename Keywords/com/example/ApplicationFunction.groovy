package com.example

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class ApplicationFunction {
	@Keyword(keywordObject='WEB_CUSTOM_KEYWORD')
	def enhanced_ClickOnDropDown(TestObject to, String dropdownValue){
		List<WebElement> dropdownval = WebUiCommonHelper.findWebElements(to, 10)
		int totalItems = dropdownval.size()
		println("Total no of items in list are: "+totalItems)
		for(int i=1; i<totalItems;i++) {
			String strItem = dropdownval.getAt(i).getText()
			println(strItem)
			if(strItem.contains(dropdownValue)) {
				WebUI.click(findTestObject('WasteDynamics/ClickEdit', [('index') : i+1]))
				break
			}
		}
	}
}
