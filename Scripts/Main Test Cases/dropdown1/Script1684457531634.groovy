import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.zomato.com/ncr')

WebUI.click(findTestObject('Object Repository/dropdown1/Page_Checkout Best Food Places To Eat In De_b07136/svg_chevron-down'))

WebUI.click(findTestObject('Object Repository/dropdown1/Page_Checkout Best Food Places To Eat In De_b07136/input_Wraps_sc-1o2pknd-1 fZoyIB'))

WebUI.click(findTestObject('Object Repository/dropdown1/Page_Checkout Best Food Places To Eat In De_b07136/div_filterFiltersRating 4.0Pure VegCuisines_16da1f'))

WebUI.click(findTestObject('Object Repository/dropdown1/Page_Checkout Best Food Places To Eat In De_b07136/div_More filterschevron-down'))

WebUI.click(findTestObject('Object Repository/dropdown1/Page_Checkout Best Food Places To Eat In De_b07136/div_filterFiltersRating 4.0Pure VegCuisines_16da1f'))

WebUI.click(findTestObject('Object Repository/dropdown1/Page_Checkout Best Food Places To Eat In De_b07136/div_filterFilters'))

WebUI.click(findTestObject('Object Repository/dropdown1/Page_Checkout Best Food Places To Eat In De_b07136/div_Cuisines1 Selected'))

WebUI.click(findTestObject('Object Repository/dropdown1/Page_Checkout Best Food Places To Eat In De_b07136/div_Rating'))

WebUI.closeBrowser()

