package shaft_alignment

import org.scalatest._

class VertexSpec extends FlatSpec with Matchers {
  "The vertex class" should "have a type" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true
   }

  "The vertex class" should "have a point value" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.point.value shouldEqual 0
  }

  "The vertex class" should "have a integer type" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.point.value.isInstanceOf[Int] shouldEqual true
  }

  "The vertex class" should "have a raw setter for point value" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.setPointValue(20) shouldEqual 20
  }

  "The vertex class" should "have a integer type the point value" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.point.value.isInstanceOf[Int] shouldEqual true
  }

  "The vertex class" should "have a raw method to set a value of the point" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.setPointValue(20) shouldEqual 20
  }

  "The vertex class" should "have a raw method to get a value of the point" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.setPointValue(20) shouldEqual 20
    vertex.getPointValue() shouldEqual 20
  }

  "The vertex class" should "have a raw method to verify the type of getter" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.getPointValue().isInstanceOf[Int] shouldEqual true
  }

  "The vertex class" should "have a raw method to verify the type of setter" in {
     val vertex = new Vertex()

     vertex.isInstanceOf[Vertex] shouldEqual true

     vertex.setPointValue(10).isInstanceOf[Int] shouldEqual true
  }

  "The vertex class" should "have a nested method to set a value" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.point.setValue(30) shouldEqual 30
  }

  "The vertex class" should "have a nested method type boolean comparison" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.point.setValue(30).isInstanceOf[Int] shouldEqual true
  }

  "The vertex class" should "have a nested method to get the value on point" in {
   val vertex = new Vertex()

   vertex.isInstanceOf[Vertex] shouldEqual true

   vertex.point.setValue(30) shouldEqual 30
   vertex.point.getValue() shouldEqual 30
  }

  "The vertex class" should "have a nested method to test the method" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.point.getValue().isInstanceOf[Int] shouldEqual true
  }

  "The vertex class" should "have a points definition" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.getPoints().isInstanceOf[List[Point]] shouldEqual true
  }

  "The vertex class" should "have a length of the points" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    vertex.getPoints().length shouldEqual 2
  }

  "The vertex class" should "have a multiple setter for values on the points" in {
    val vertex = new Vertex()

    vertex.isInstanceOf[Vertex] shouldEqual true

    val vertexPoints = vertex.getPoints(1, 2, 3)

    vertexPoints.isInstanceOf[List[Point]] shouldEqual true

    vertexPoints.length shouldEqual 3

    vertexPoints(0).getValue() shouldEqual 1
    vertexPoints(1).getValue() shouldEqual 2
    vertexPoints(2).getValue() shouldEqual 3
  }
}
