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

WebUI.setText(findTestObject('Object Repository/Booking flow1/Page_Book Secret Hotel Deals For 2.1M Hotel_11856d/input_Privacy Policy_email'), 
    'lockbird22@gmail.com')

WebUI.click(findTestObject('Object Repository/Booking flow1/Page_Book Secret Hotel Deals For 2.1M Hotel_11856d/button_NEXT'))

WebUI.setEncryptedText(findTestObject('Object Repository/Booking flow1/Page_Book Secret Hotel Deals For 2.1M Hotel_11856d/input_Privacy Policy_password'), 
    'aa3COGZLbfKzBc76Ehoqiw==')

WebUI.click(findTestObject('Object Repository/Booking flow1/Page_Book Secret Hotel Deals For 2.1M Hotel_11856d/button_NEXT'))

WebUI.setText(findTestObject('Object Repository/Booking flow1/Page_Book Secret Hotel Deals For 2.1M Hotel_11856d/input_Destination_headlessui-combobox-input-8'), 
    'varna')

WebUI.click(findTestObject('Object Repository/Booking flow1/Page_Book Secret Hotel Deals For 2.1M Hotel_11856d/li_Varna, Bulgaria'))

WebUI.setText(findTestObject('Object Repository/Booking flow1/Page_Book Secret Hotel Deals For 2.1M Hotel_11856d/input_Destination_headlessui-combobox-input-8'), 
    'Varna, Bulgaria')

WebUI.click(findTestObject('Object Repository/Booking flow1/Page_Book Secret Hotel Deals For 2.1M Hotel_11856d/button_Rooms  Guests_w-full block flex item_070664'))

WebUI.click(findTestObject('Object Repository/Booking flow1/Page_Top 25 Varna, Bulgaria Hotel Deals for_81a4ad/button_CHOOSE ROOM'))

WebUI.switchToWindowTitle('Aqua Hotel | LockTrip.com')

WebUI.click(findTestObject('Object Repository/Booking flow1/Page_Aqua Hotel  LockTrip.com/button_SELECT ROOM'))

WebUI.click(findTestObject('Object Repository/Booking flow1/Page_Aqua Hotel  LockTrip.com/input_Adult_rooms.0.adults.1.firstName'))

WebUI.setText(findTestObject('Object Repository/Booking flow1/Page_Aqua Hotel  LockTrip.com/input_Adult_rooms.0.adults.1.firstName_1'), 
    'L')

WebUI.setText(findTestObject('Object Repository/Booking flow1/Page_Aqua Hotel  LockTrip.com/input_Adult_rooms.0.adults.1.firstName_1_2'), 
    'Lo')

WebUI.setText(findTestObject('Object Repository/Booking flow1/Page_Aqua Hotel  LockTrip.com/input_Adult_rooms.0.adults.1.firstName_1_2_3'), 
    'Loc')

WebUI.setText(findTestObject('Object Repository/Booking flow1/Page_Aqua Hotel  LockTrip.com/input_Adult_rooms.0.adults.1.firstName_1_2_3_4'), 
    'Lock')

WebUI.click(findTestObject('Object Repository/Booking flow1/Page_Aqua Hotel  LockTrip.com/input_Adult_rooms.0.adults.1.lastName'))

WebUI.setText(findTestObject('Object Repository/Booking flow1/Page_Aqua Hotel  LockTrip.com/input_Adult_rooms.0.adults.1.lastName_1'), 
    'T')

WebUI.setText(findTestObject('Object Repository/Booking flow1/Page_Aqua Hotel  LockTrip.com/input_Adult_rooms.0.adults.1.lastName_1_2'), 
    'Tr')

WebUI.setText(findTestObject('Object Repository/Booking flow1/Page_Aqua Hotel  LockTrip.com/input_Adult_rooms.0.adults.1.lastName_1_2_3'), 
    'Tri')

WebUI.setText(findTestObject('Object Repository/Booking flow1/Page_Aqua Hotel  LockTrip.com/input_Adult_rooms.0.adults.1.lastName_1_2_3_4'), 
    'Trip')

WebUI.click(findTestObject('Object Repository/Booking flow1/Page_Aqua Hotel  LockTrip.com/label_I have read and agreed to the hotel c_8edfcb'))

WebUI.click(findTestObject('Object Repository/Booking flow1/Page_Aqua Hotel  LockTrip.com/input_hotel cancellation and room policies__cd574a'))

WebUI.click(findTestObject('Object Repository/Booking flow1/Page_Aqua Hotel  LockTrip.com/button_PAY   49.05'))

WebUI.closeBrowser()

