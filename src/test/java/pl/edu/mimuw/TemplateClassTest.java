package pl.edu.mimuw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemplateClassTest {

  @Test
  void testTemplateGreeting() {
    final var template = new TemplateClass();

    final var expected = "Hello world";
    final var actual = template.getGreeting();

    assertEquals(expected, actual);
  }
}
