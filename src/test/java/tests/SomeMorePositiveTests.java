package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@Owner("arina_ng")
@Feature("Позитивные тесты")
@Story("Еще немного позитивных тестов")
@DisplayName("9 тестов")
public class SomeMorePositiveTests {

  @Test
  void some1Test() {
    assertTrue(true);
  }

  @Test
  void some2Test() {
    assertTrue(true);
  }

  @Test
  void some3Test() {
    assertTrue(true);
  }

  @Test
  void some4Test() {
    assertTrue(true);
  }

  @Test
  void some5Test() {
    assertTrue(true);
  }

  @Test
  void some6Test() {
    assertTrue(true);
  }

  @Test
  void some7Test() {
    assertTrue(true);
  }

  @Test
  void some8Test() {
    assertTrue(true);
  }

  @Test
  void some9Test() {
    assertTrue(true);
  }
}