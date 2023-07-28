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

WebUI.navigateToUrl('https://www.startech.com/')

WebUI.click(findTestObject('Object Repository/StarTech/Page_StarTech.com  IT Pros Trusted Source f_0caaa6/a_United States'))

WebUI.click(findTestObject('Object Repository/StarTech/Page_StarTech.com  IT Pros Trusted Source f_0caaa6/a_Canada'))

WebUI.click(findTestObject('Object Repository/StarTech/Page_StarTech.com  IT Pros Trusted Source f_f02d26/button_Accept'))

WebUI.click(findTestObject('Object Repository/StarTech/Page_StarTech.com  IT Pros Trusted Source f_f02d26/a_AODA'))

WebUI.click(findTestObject('Object Repository/StarTech/Page_Accessibility for Ontarians with Disab_b28aab/a_StarTech.com - Integrated Accessibility Standard'))

