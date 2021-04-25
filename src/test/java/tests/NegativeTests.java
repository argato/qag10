package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Owner("arina_ng")
@Feature("Негативные тесты")
@Story("Немного негативных тестов")
@DisplayName("8 тестов")
@Tag("regress")
public class NegativeTests {

  @Test
  @Severity(SeverityLevel.MINOR)
  void some1Test() {
    assertTrue(false);
  }

  @Test
  @Severity(SeverityLevel.TRIVIAL)
  void some2Test() {
    assertTrue(false);
  }

  @Test
  @Severity(SeverityLevel.MINOR)
  void some3Test() {
    assertTrue(false);
  }

  @Test
  @Severity(SeverityLevel.MINOR)
  void some4Test() {
    assertTrue(false);
  }

  @Test
  @Severity(SeverityLevel.NORMAL)
  void some5Test() {
    assertTrue(false);
  }

  @Test
  @Severity(SeverityLevel.MINOR)
  void some6Test() {
    assertTrue(false);
  }

  @Test
  @Severity(SeverityLevel.TRIVIAL)
  void some7Test() {
    assertTrue(false);
  }

  @Test
  @Severity(SeverityLevel.TRIVIAL)
  void some8Test() {
    assertTrue(false);
  }
}
