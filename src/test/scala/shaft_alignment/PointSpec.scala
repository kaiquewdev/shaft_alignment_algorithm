package shaft_alignment

import org.scalatest._

class PointSpec extends FlatSpec with Matchers {
  "The point class" should "has value" in {
    val point = new Point()

    point.isInstanceOf[Point] shouldEqual true

    point.value shouldEqual 0
    point.value.isInstanceOf[Int] shouldEqual true
  }

  "The point class" should "have to set a value" in {
    val point = new Point()

    point.isInstanceOf[Point] shouldEqual true

    point.setValue(10) shouldEqual 10
    point.setValue(15).isInstanceOf[Int] shouldEqual true
  }

  "The point class" should "have to get a value" in {
    val point = new Point()

    point.isInstanceOf[Point] shouldEqual true

    point.setValue(20) shouldEqual 20
    point.getValue() shouldEqual 20
    point.getValue().isInstanceOf[Int] shouldEqual true
  }
}
