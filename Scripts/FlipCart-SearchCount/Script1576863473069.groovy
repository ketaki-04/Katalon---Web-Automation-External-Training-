import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.flipkart.com/')

WebUI.click(findTestObject('Page_FlipcartCount/button_'))

WebUI.setText(findTestObject('Page_FlipcartCount/input_Plus_q'), 'Iphone')

//println(WebUI.getText((findTestObject('Page_FlipcartCount/AutoSuggesionBox'))))

List<WebElement> Autosugg = WebUI.findWebElements(findTestObject('Page_FlipcartCount/Suggessions'),3)

println(Autosugg.size())

//for (i=0 ; i<=Autosugg ;i++)
//{
//	println("Suggession: " + i.get)
//}

Autosugg.each({def it -> println('Suggession :'+it.getText())})

WebUI.closeBrowser()

