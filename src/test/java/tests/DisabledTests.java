package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Owner("arina_ng")
@Feature("Позитивные тесты")
@Story("10ть позитивных тестов")
@DisplayName("Отключенные тесты")
public class DisabledTests {

  @Test
  @Disabled
  @Severity(SeverityLevel.MINOR)
  void some1Test() {
    assertTrue(true);
  }

  @Test
  @Disabled
  @Severity(SeverityLevel.MINOR)
  void some2Test() {
    assertTrue(true);
  }

  @Test
  @Disabled
  @Severity(SeverityLevel.MINOR)
  void some3Test() {
    assertTrue(true);
  }

  @Test
  @Disabled
  @Severity(SeverityLevel.MINOR)
  void some4Test() {
    assertTrue(true);
  }

  @Test
  @Disabled
  @Severity(SeverityLevel.MINOR)
  void some5Test() {
    assertTrue(true);
  }

  @Test
  @Disabled
  @Severity(SeverityLevel.MINOR)
  void some6Test() {
    assertTrue(true);
  }

  @Test
  @Disabled
  @Severity(SeverityLevel.MINOR)
  void some7Test() {
    assertTrue(true);
  }

  @Test
  @Disabled
  @Severity(SeverityLevel.TRIVIAL)
  void some8Test() {
    assertTrue(true);
  }

  @Test
  @Disabled
  @Severity(SeverityLevel.TRIVIAL)
  void some9Test() {
    assertTrue(true);
  }

  @Test
  @Disabled
  @Severity(SeverityLevel.TRIVIAL)
  void some10Test() {
    assertTrue(true);
  }
}
