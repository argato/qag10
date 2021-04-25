package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@Owner("arina_ng")
@Feature("Позитивные тесты")
@Story("Еще немного позитивных тестов")
@DisplayName("9 тестов")
public class SomeMorePositiveTests {

  @Test
  @Severity(SeverityLevel.MINOR)
  void some1Test() {
    assertTrue(true);
  }

  @Test
  @Severity(SeverityLevel.MINOR)
  void some2Test() {
    assertTrue(true);
  }

  @Test
  @Severity(SeverityLevel.MINOR)
  void some3Test() {
    assertTrue(true);
  }

  @Test
  @Severity(SeverityLevel.MINOR)
  void some4Test() {
    assertTrue(true);
  }

  @Test
  @Severity(SeverityLevel.MINOR)
  void some5Test() {
    assertTrue(true);
  }

  @Test
  @Severity(SeverityLevel.MINOR)
  void some6Test() {
    assertTrue(true);
  }

  @Test
  @Severity(SeverityLevel.MINOR)
  void some7Test() {
    assertTrue(true);
  }

  @Test
  @Severity(SeverityLevel.MINOR)
  void some8Test() {
    assertTrue(true);
  }

  @Test
  @Severity(SeverityLevel.MINOR)
  void some9Test() {
    assertTrue(true);
  }
}
