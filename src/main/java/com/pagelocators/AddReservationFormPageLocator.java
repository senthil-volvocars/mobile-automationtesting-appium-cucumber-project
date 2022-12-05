package com.pagelocators;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AddReservationFormPageLocator {


	@AndroidFindBy(xpath="//android.widget.EditText[@text='Name']")
	public MobileElement nameField;

	@AndroidFindBy(xpath="//android.widget.EditText[@text='Phone']")
	public MobileElement phoneNumber;

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.TableLayout/android.widget.TableRow/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.EditText")
	public MobileElement dateField;

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
	public MobileElement dateOkBtn;

	//@AndroidFindBy(id="org.nativescript.examples:id/number_picker_plus")
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.TableLayout/android.widget.TableRow/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.EditText")
	public MobileElement timeField;

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
	public MobileElement timeOkBtn;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='+']")
	public MobileElement guestPicker;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='1st floor']")
	public MobileElement sectionDropDown;

	@AndroidFindBy(xpath="//android.widget.CheckedTextView[3]")
	public MobileElement sectionDropDown_thirdOption;


	@AndroidFindBy(xpath="//android.widget.TextView[@text='1']")
	public MobileElement tableDropDown;

	@AndroidFindBy(xpath="//android.widget.CheckedTextView[4]")
	public MobileElement tableDropDown_lastOption;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='in-person']")
	public MobileElement orignDropDown;

	@AndroidFindBy(xpath="//android.widget.CheckedTextView[3]")
	public MobileElement orignDropDown_thirdOption;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='DONE']")
	public MobileElement doneBtn;



}
