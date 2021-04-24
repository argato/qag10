package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
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
  void some1Test() {
    assertTrue(true);
  }

  @Test
  @Disabled
  void some2Test() {
    assertTrue(true);
  }

  @Test
  @Disabled
  void some3Test() {
    assertTrue(true);
  }

  @Test
  @Disabled
  void some4Test() {
    assertTrue(true);
  }

  @Test
  @Disabled
  void some5Test() {
    assertTrue(true);
  }

  @Test
  @Disabled
  void some6Test() {
    assertTrue(true);
  }

  @Test
  @Disabled
  void some7Test() {
    assertTrue(true);
  }

  @Test
  @Disabled
  void some8Test() {
    assertTrue(true);
  }

  @Test
  @Disabled
  void some9Test() {
    assertTrue(true);
  }

  @Test
  @Disabled
  void some10Test() {
    assertTrue(true);
  }
}
