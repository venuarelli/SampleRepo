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

WebUI.mouseOver(findTestObject('OrangeHRM_Recruitment/b_Recruitment'))

WebUI.click(findTestObject('OrangeHRM_Recruitment/a_Candidates'))

WebUI.setText(findTestObject('OrangeHRM_Recruitment/input_Candidate Name_candidateSearchcandidateName'), 'john.smith')

WebUI.setText(findTestObject('OrangeHRM_Recruitment/input_Keywords_candidateSearchkeywords'), 'candidate')

WebUI.setText(findTestObject('OrangeHRM_Recruitment/input_From_candidateSearchdateApplicationfrom'), '02-03-2020')

