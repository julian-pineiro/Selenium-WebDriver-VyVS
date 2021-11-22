import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageObject {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "inventory_item_name")
    private WebElement inventoryItemName;

    public String getInventoryItemName() {
        return inventoryItemName.getText();
    }
}
