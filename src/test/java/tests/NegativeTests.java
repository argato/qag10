package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Owner("arina_ng")
@Feature("Негативные тесты")
@Story("Немного негативных тестов")
@DisplayName("8 тестов")
public class NegativeTests {

  @Test
  void some1Test() {
    assertTrue(false);
  }

  @Test
  void some2Test() {
    assertTrue(false);
  }

  @Test
  void some3Test() {
    assertTrue(false);
  }

  @Test
  void some4Test() {
    assertTrue(false);
  }

  @Test
  void some5Test() {
    assertTrue(false);
  }

  @Test
  void some6Test() {
    assertTrue(false);
  }

  @Test
  void some7Test() {
    assertTrue(false);
  }

  @Test
  void some8Test() {
    assertTrue(false);
  }
}
