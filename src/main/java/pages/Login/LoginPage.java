package pages.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    By tetonHomePage = By.xpath("(//a[normalize-space()='Home'])[1]");
    By aboutUs = By.xpath("(//a[normalize-space()='About Us'])[1]");
    By products = By.xpath("(//a[normalize-space()='Products'])[1]");
    By faqs = By.xpath("(//a[normalize-space()='FAQ'])[1]");
    By contactUs = By.xpath("(//a[normalize-space()='Contact Us'])[1]");
    By favorite = By.xpath("//i[@class='flaticon-heart-shape-outline']");
    By login = By.xpath("//a[@class='auth-link']");
    By loginFormLabel = By.xpath("//a[@class='auth-link']");
    By emailInputField = By.xpath("//input[@id='name']");
    By passwordInputField = By.xpath("//input[@id='password']");
    By errorMessage = By.xpath("//strong[normalize-space()='This email is not registered']");
    By registrationForm = By.xpath("//div[@class='form-container']");
    By regNameInputField = By.xpath("//input[@id='name']");
    By regEmailInputField = By.xpath("//input[@placeholder='Enter email address']");
    By regPhoneInputField = By.xpath("//input[@id='mobile']");
    By regPassInputField = By.xpath("//input[@id='password']");
    By regButton = By.xpath("//button[normalize-space()='Register']");
    By regInfo = By.xpath("//div[@class='form-container']");
    By regSetting = By.xpath("(//a[normalize-space()='Settings'])[1]");

    By loginButton = By.xpath("//button[normalize-space()='Login']");
    By registerButton = By.xpath("//a[normalize-space()='register']");
    By resetPassword = By.xpath("//a[normalize-space()='reset password']");
    By resetPasswordEmail = By.xpath("//input[@id='email']");
    By passwordResetLink = By.xpath("//button[contains(text(),'Send Password Reset')]");
    By unregisteredEmailError = By.xpath("//span[@class='cm-string']");
    By profile = By.xpath("//i[@class='flaticon-user-profile']");
    By logoutButton = By.xpath("(//a[normalize-space()='Logout'])[1]");
    By myOrder = By.xpath("(//a[contains(text(),'My')])[1]");
    By myAddress = By.xpath("(//a[contains(text(),'My')])[2]");
    By addAddress = By.xpath("//a[normalize-space()='Add new address']");
    By addressCountry = By.xpath("(//span[@role='presentation'])[1]");
    By addressDistrict = By.xpath("(//span[@role='presentation'])[2]");
    By addressArea = By.xpath("(//span[@role='presentation'])[3]");
    By addressInputField = By.xpath("//input[@id='address']");
    By nameInputField = By.xpath("//input[@id='user_name']");
    By phoneInputField = By.xpath("//input[@id='phone']");
    By addressCreateBtn = By.xpath("//button[normalize-space()='Create']");
    By createdAddressLabel = By.xpath("//h5[normalize-space()='Address #1']");
    By hoverOnProduct = By.xpath("//img[@alt='Teton Smart Scale (Bluetooth)']");
    By viewProduct = By.xpath("(//a[normalize-space()='view details'])[2]");
    By productName = By.xpath("//h1[normalize-space()='Teton Smart Scale (Bluetooth)']");
    By productInStock = By.xpath("//p[@class='style-name']");
    By productPrice = By.xpath("//div[@class='price']");
    By addFavorite = By.xpath("//a[@id='AddtoFav']");
    By addToCart = By.xpath("//button[@id='addToCart']");
    By productAddedToCart = By.xpath("//div[normalize-space()='Product added to cart']");
    By productShoppingBag = By.xpath("//i[@class='flaticon-shopping-bag']");
    By addedProductDetail = By.xpath("//ul[@id='minicart']");
    By productShoppingCratBtn = By.xpath("//a[normalize-space()='Shopping Cart']");
    By productCheckoutBtn = By.xpath("//button[normalize-space()='Checkout']");
    By orderSummary = By.xpath("//h4[normalize-space()='Order Summary']");
    By orderSummaryDetail = By.xpath("//div[@class='col-lg-4']");


    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getTetonHomePage() {
        return driver.findElement(tetonHomePage);
    }

    public WebElement getAboutUs() {
        return driver.findElement(aboutUs);
    }

    public WebElement getProducts() {
        return driver.findElement(products);
    }

    public WebElement getFaqs() {
        return driver.findElement(faqs);
    }

    public WebElement getContactUs() {
        return driver.findElement(contactUs);
    }

    public WebElement getFavorite() {
        return driver.findElement(favorite);
    }

    public WebElement getLogin() {
        return driver.findElement(login);
    }

    public WebElement getLoginFormLabel() {
        return driver.findElement(loginFormLabel);
    }

    public WebElement getEmailInputField() {
        return driver.findElement(emailInputField);
    }

    public WebElement getPasswordInputField() {
        return driver.findElement(passwordInputField);
    }
    public WebElement getErrorMessage() {
        return driver.findElement(errorMessage);
    }
    public WebElement getRegistrationForm() {
        return driver.findElement(registrationForm);
    }
    public WebElement getRegNameInputField() {
        return driver.findElement(regNameInputField);
    }
    public WebElement getRegEmailInputField() {
        return driver.findElement(regEmailInputField);
    }
    public WebElement getRegPhoneInputField() {
        return driver.findElement(regPhoneInputField);
    }
    public WebElement getRegPassInputField() {
        return driver.findElement(regPassInputField);
    }
    public WebElement getRegButton() {
        return driver.findElement(regButton);
    }
    public WebElement getRegisteredInformation() {
        return driver.findElement(regInfo);
    }
    public WebElement getRegSetting() {
        return driver.findElement(regSetting);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }

    public WebElement getRegisterButton() {
        return driver.findElement(registerButton);
    }

    public WebElement getresetPassword() {
        return driver.findElement(resetPassword);
    }

    public WebElement getresetPasswordEmail() {
        return driver.findElement(resetPasswordEmail);
    }

    public WebElement getpasswordResetLink() {
        return driver.findElement(passwordResetLink);
    }

    public WebElement getunregisteredEmailError() {
        return driver.findElement(unregisteredEmailError);
    }

    public WebElement getprofile() {
        return driver.findElement(profile);
    }

    public WebElement getlogoutButton() {
        return driver.findElement(logoutButton);
    }

    public WebElement getmyOrder() {
        return driver.findElement(myOrder);
    }

    public WebElement getmyAddress() {
        return driver.findElement(myAddress);
    }

    public WebElement getaddAddress() {
        return driver.findElement(addAddress);
    }

    public WebElement getaddressCountry() {
        return driver.findElement(addressCountry);
    }

    public WebElement getaddressDistrict() {
        return driver.findElement(addressDistrict);
    }

    public WebElement getaddressArea() {
        return driver.findElement(addressArea);
    }

    public WebElement getaddressInputField() {
        return driver.findElement(addressInputField);
    }

    public WebElement getnameInputField() {
        return driver.findElement(nameInputField);
    }

    public WebElement getphoneInputField() {
        return driver.findElement(phoneInputField);
    }

    public WebElement getaddressCreateBtn() {
        return driver.findElement(addressCreateBtn);
    }

    public WebElement getcreatedAddressLabel() {
        return driver.findElement(createdAddressLabel);
    }

    public WebElement gethoverOnProduct() {
        return driver.findElement(hoverOnProduct);
    }

    public WebElement getviewProduct() {
        return driver.findElement(viewProduct);
    }

    public WebElement getproductName() {
        return driver.findElement(productName);
    }

    public WebElement getproductInStock() {
        return driver.findElement(productInStock);
    }

    public WebElement getproductPrice() {
        return driver.findElement(productPrice);
    }

    public WebElement getaddFavorite() {
        return driver.findElement(addFavorite);
    }

    public WebElement getaddToCart() {
        return driver.findElement(addToCart);
    }

    public WebElement getproductAddedToCart() {
        return driver.findElement(productAddedToCart);
    }

    public WebElement getproductShoppingBag() {
        return driver.findElement(productShoppingBag);
    }

    public WebElement getaddedProductDetail() {
        return driver.findElement(addedProductDetail);
    }
    public WebElement getproductShoppingCratBtn() {
        return driver.findElement(productShoppingCratBtn);
    }
    public WebElement getproductCheckoutBtn() {
        return driver.findElement(productCheckoutBtn);
    }
    public WebElement getorderSummary() {
        return driver.findElement(orderSummary);
    }
    public WebElement getorderSummaryDetail() {
        return driver.findElement(orderSummaryDetail);
    }


}
