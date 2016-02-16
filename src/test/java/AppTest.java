import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567");
    assertThat(pageSource()).contains("Triangle Finder");
  }

  @Test
  public void triangleTestIsNotATriangle() {
    goTo("http://localhost:4567/");
    fill("#sideOneIn").with("2");
    fill("#sideTwoIn").with("2");
    fill("#sideThreeIn").with("8");
    submit(".btn");
    assertThat(pageSource()).contains("Your triangle is not a triangle");
  }
}
