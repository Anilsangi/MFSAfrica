package MfsAfrica.MfsAfricaTest;

import org.junit.Test;
import com.mfs.qa.base.TestBase;
import com.mfs.qa.pages.HomePage;
import com.mfs.qa.pages.LoginPage;
import com.mfs.qa.pages.ProductAddToCart;
import com.mfs.qa.pages.SetLabel;

public class LoginTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;

	public LoginTest() {
		super();

	}

	@Test
	public void LoginTest() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		SetLabel setlabel = new SetLabel();
		setlabel.SetLabelPrint();
		Thread.sleep(2000);
		ProductAddToCart addcart = new ProductAddToCart();
		addcart.CartAdd();
	}
}
