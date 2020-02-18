package NewMavenProject.NewMavenProject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WikipediaLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		List<WebElement> links = new ArrayList();
		links = driver.findElements(By.tagName("a"));

		System.out.println("----Count of Links---- ");
		System.out.println("Total count of links on the page is:" + links.size());
		System.out.println("Following are the links on the page:");
		System.out.println("---Below are the link names----");
		for (WebElement ls : links) {

			System.out.println(ls.getText() + "    ---URL is---  " + ls.getAttribute("href"));

		}
		System.out.println("Getting link from a specific section:");
		List<WebElement> lsdiv = new ArrayList();
		lsdiv = driver.findElements(By.xpath("//div[@data-el-section=\"other projects\"]//div/a"));
		System.out.println("----Count of Links---- ");
		System.out.println("Total count of links on the page is:" + lsdiv.size());
		System.out.println("Following are the links on the page:");
		System.out.println("---Below are the link names----");
		for (WebElement ls : lsdiv) {

			System.out.println(ls.getText());

		}

		/// Other way to find element in a block or any table

		WebElement block = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[6]/div[3]/div[1]"));
		System.out.println("Size of block is:" + block.findElements(By.tagName("a")).size());
		System.out.println("Clicking second element of the block:");
		block.findElements(By.tagName("a")).get(2).click();
		driver.close();

	}

}
