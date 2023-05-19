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

Mobile.startApplication('/Users/kavitabhatt/Downloads/ApiDemos-debug.apk', true)

Mobile.tap(findTestObject('Object Repository/MobileTest1/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/MobileTest1/android.widget.TextView - Text'), 0)

Mobile.tap(findTestObject('Object Repository/MobileTest1/android.widget.TextView - LogTextBox'), 0)

Mobile.tap(findTestObject('Object Repository/MobileTest1/android.widget.Button - Add'), 0)

Mobile.sendKeys(findTestObject('Object Repository/MobileTest1/android.widget.TextView - This is a test'), 'Demo')

Mobile.verifyElementText(findTestObject('Object Repository/MobileTest1/android.widget.TextView - This is a testDemo'), 'This is a test\nDemo')

Mobile.tap(findTestObject('Object Repository/MobileTest1/android.widget.Button - Do nothing'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

