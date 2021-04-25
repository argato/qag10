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
@Story("Больше позитивных тестов")
@DisplayName("11 тестов")
public class MorePositiveTests {

  @Test
  @Severity(SeverityLevel.CRITICAL)
  void some1Test() {
    assertTrue(true);
  }

  @Test
  @Severity(SeverityLevel.CRITICAL)
  void some2Test() {
    assertTrue(true);
  }

  @Test
  @Severity(SeverityLevel.CRITICAL)
  void some3Test() {
    assertTrue(true);
  }

  @Test
  @Severity(SeverityLevel.CRITICAL)
  void some4Test() {
    assertTrue(true);
  }

  @Test
  @Severity(SeverityLevel.CRITICAL)
  void some5Test() {
    assertTrue(true);
  }

  @Test
  @Severity(SeverityLevel.CRITICAL)
  void some6Test() {
    assertTrue(true);
  }

  @Test
  @Severity(SeverityLevel.CRITICAL)
  void some7Test() {
    assertTrue(true);
  }

  @Test
  @Severity(SeverityLevel.CRITICAL)
  void some8Test() {
    assertTrue(true);
  }

  @Test
  @Severity(SeverityLevel.MINOR)
  void some9Test() {
    assertTrue(true);
  }

  @Test
  @Severity(SeverityLevel.BLOCKER)
  void some10Test() {
    assertTrue(true);
  }

  @Test
  @Severity(SeverityLevel.TRIVIAL)
  void some11Test() {
    assertTrue(true);
  }
}
