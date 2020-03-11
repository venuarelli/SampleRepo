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

WebUI.click(findTestObject('Page_OrangeHRM/b_Admin'))

WebUI.mouseOver(findTestObject('Page_OrangeHRM/a_User Management'))

WebUI.click(findTestObject('Page_OrangeHRM/a_Users'))

WebUI.setText(findTestObject('Page_OrangeHRM/systemUser'), GlobalVariable.adminName)

WebUI.click(findTestObject('Page_OrangeHRM/select_AllAdminESS'))

WebUI.click(findTestObject('Page_OrangeHRM/dropdownValue'))

WebUI.setText(findTestObject('Page_OrangeHRM/input_Employee Name_searchSystemUseremployeeNameempName'), GlobalVariable.adminName)

WebUI.click(findTestObject('Page_OrangeHRM/input_Status__search'))

WebUI.click(findTestObject('add_User/Page_OrangeHRM/input_Status_btnAdd'))

WebUI.setText(findTestObject('add_User/Page_OrangeHRM/input__systemUseremployeeNameempName'), GlobalVariable.employeeName_Add_User)

WebUI.setText(findTestObject('add_User/Page_OrangeHRM/input__systemUseruserName'), GlobalVariable.userName_Add_User)

WebUI.setText(findTestObject('add_User/Page_OrangeHRM/input__systemUserpassword'), GlobalVariable.password_add_User)

WebUI.setText(findTestObject('add_User/Page_OrangeHRM/input__systemUserconfirmPassword'), GlobalVariable.password_add_User)

WebUI.click(findTestObject('add_User/Page_OrangeHRM/input__btnSave'))

