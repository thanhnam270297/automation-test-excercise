package elementPage;

public class homePageUI {

	public static final String WELLCOME_SLIDER = "//marquee[text()]";

	// For "New Customer" and "New Account" link
	public static final String DYNAMIC_LINK = "//a[text()='%s']";

	// For "Customer Name", "Date of Birth", "City", "State", "PIN", "Mobile Number", "E-mail" and "Password"
	public static final String DYNAMIC_TEXTBOX_ON_NEW_CUSTOMER = "//td[text()='%s']/following-sibling::td/input";

	// For "Address" only
	public static final String ADDRESS_TEXTBOX_ON_NEW_CUSTOMER = "//td[text()='Address']/following-sibling::td/textarea";

	public static final String SUBMIT_BUTTON_ON_NEW_CUSTOMER = "//input[@type='submit']";

	public static final String CUSTOMER_REGISTERED_SUCCESSFULLY_MESSAGE = "//p[text()='Customer Registered Successfully!!!']";

	public static final String CUSTOMER_ID = "//td[text()='Customer ID']/following-sibling::td";

	public static final String DYNAMIC_TEXTBOX_ON_NEW_ACCOUNT = "//td[contains(text(),'%s')]/following-sibling::td/input";

	public static final String SUBMIT_BUTTON_ON_NEW_ACCOUNT = "//input[@name='button2']";

	public static final String ACCOUNT_GENERATED_SUCCESSFULLY_MESSAGE = "//p[text()='Account Generated Successfully!!!']";
}
