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

WebUI.navigateToUrl('https://locktrip.com/')

WebUI.click(findTestObject('Object Repository/london/Page_Book Secret Hotel Deals For 2.1M Hotel_11856d/button_Privacy Policy_right-2 top-2 bg-whit_745a16'))

WebUI.setText(findTestObject('Object Repository/london/Page_Book Secret Hotel Deals For 2.1M Hotel_11856d/input_Destination_headlessui-combobox-input-8'), 
    'london')

WebUI.click(findTestObject('Object Repository/london/Page_Book Secret Hotel Deals For 2.1M Hotel_11856d/li_London, UK'))

WebUI.setText(findTestObject('Object Repository/london/Page_Book Secret Hotel Deals For 2.1M Hotel_11856d/input_Destination_headlessui-combobox-input-8'), 
    'London, UK')

WebUI.click(findTestObject('Object Repository/london/Page_Book Secret Hotel Deals For 2.1M Hotel_11856d/button_Rooms  Guests_w-full block flex item_070664'))

WebUI.closeBrowser()

