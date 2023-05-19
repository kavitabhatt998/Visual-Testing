import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ashleyhomestore.ca/')

WebUI.click(findTestObject('Object Repository/Sofa/Page_Furniture and Mattress Store  Ashley Canada/div_Update your postal code         Update _9cc240'))

WebUI.setText(findTestObject('Object Repository/Sofa/Page_Furniture and Mattress Store  Ashley Canada/input_Update your postal code_postalcode-in_fbfdff'), 
    'V1T4Z8')

WebUI.click(findTestObject('Object Repository/Sofa/Page_Furniture and Mattress Store  Ashley Canada/button_Update'))

WebUI.setText(findTestObject('Object Repository/Sofa/Page_Furniture and Mattress Store  Ashley Canada/input_Kelowna, 2514 N Hwy 97_autosuggest__i_f230e2'), 
    'Red Sofa')

WebUI.sendKeys(findTestObject('Object Repository/Sofa/Page_Furniture and Mattress Store  Ashley Canada/input_Kelowna, 2514 N Hwy 97_autosuggest__i_f230e2'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Sofa/Page_Search  Ashley Canada/h2_Maimz- EXCLUSIVE Sofa'))

WebUI.click(findTestObject('Object Repository/Sofa/Page_Maimz- EXCLUSIVE Sofa  Ashley Canada/svg_Quantity_fa-icon'))

WebUI.click(findTestObject('Object Repository/Sofa/Page_Maimz- EXCLUSIVE Sofa  Ashley Canada/svg_Quantity_fa-icon'))

WebUI.setText(findTestObject('Object Repository/Sofa/Page_Maimz- EXCLUSIVE Sofa  Ashley Canada/input_Quantity_atc-quantity'), 
    '2')

WebUI.click(findTestObject('Object Repository/Sofa/Page_Maimz- EXCLUSIVE Sofa  Ashley Canada/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Sofa/Page_Maimz- EXCLUSIVE Sofa  Ashley Canada/a_No, thanks'))

WebUI.click(findTestObject('Object Repository/Sofa/Page_Maimz- EXCLUSIVE Sofa  Ashley Canada/a_View Cart'))

WebUI.click(findTestObject('Object Repository/Sofa/Page_Your Shopping Cart  Ashley Canada/div_Discounted Price                       _1c62d4'))

WebUI.verifyElementText(findTestObject('Object Repository/Sofa/Page_Your Shopping Cart  Ashley Canada/div_2,519.98'), '$2,519.98')

//String object1 = WebUI.getText(findTestObject('Object1'))
//String object2 = WebUI.getText(findTestObject('Object2'))
//
//if(object1 != object2) {
//	KeywordUtil.markFailed(object1 + " and " + object2 + " do not match.")
//}
WebUI.closeBrowser()

