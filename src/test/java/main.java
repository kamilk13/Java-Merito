import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String sutUrl = "http://e.pl/";
        driver.get(sutUrl);
        //klikanie w elementy na stronie
        System.out.println("Adres tej storny to " + driver.getCurrentUrl());
        System.out.println("Tytuł tej strony to: " + driver.getTitle());
        System.out.println("Otwarto stronę");
        System.out.println("Źródło strony" + driver.getPageSource());

        WebElement zakladkaEmail = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[8]"));
        zakladkaEmail.click();
        WebElement zakladkaHosting = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[16]"));
        zakladkaHosting.click();
        WebElement zakladkaStronaGlowna = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[4]"));
        zakladkaStronaGlowna.click();

        driver.quit();
        System.out.println("Zamknięto przeglądarkę");

    }
}