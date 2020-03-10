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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.setText(findTestObject('Page_OrangeHRM/input_LOGIN Panel_txtUsername'), GlobalVariable.username)

WebUI.setText(findTestObject('Page_OrangeHRM/input_Username_txtPassword'), GlobalVariable.password)

WebUI.click(findTestObject('Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Upload_File/a_PIM'))

WebUI.click(findTestObject('Upload_File/a_Add Employee'))

WebUI.setText(findTestObject('Upload_File/input__firstName'), GlobalVariable.userName_Add_User)

WebUI.setText(findTestObject('Upload_File/input__lastName'), GlobalVariable.userName_Add_User)

WebUI.uploadFile(findTestObject('Upload_File/input_Photograph_photofile'), 'C:\\Users\\Venu.Aarelli\\Desktop\\TUIUI_Screenshots\\AfterLogin.PNG')

