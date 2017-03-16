package example

import org.scalatest._
import rx.lang.scala.Observable

class AxisSpec extends FlatSpec with Matchers {
  "The point class" should "has value" in {
    val point = new Point()
    point.value shouldEqual 0
  }

  "The axis class" should "has points" in {
    val axis = new Axis()
    axis.x shouldEqual 0
    axis.y shouldEqual 0
    axis.z shouldEqual 0
  }

  "The axis class" should "increase the x points" in {
    val axis = new Axis()
    axis.increaseX(10)
    axis.x shouldEqual 10
  }

  "The axis class" should "decrease the x points" in {
    val axis = new Axis()
    axis.decreaseX(5)
    axis.x shouldEqual -5
    axis.increaseX(15)
    axis.decreaseX(5)
    axis.x shouldEqual 5
  }

  "The axis class" should "increase the y points" in {
    val axis = new Axis()
    axis.increaseY(10)
    axis.y shouldEqual 10
  }

  "The axis class" should "decrease the y points" in {
    val axis = new Axis()
    axis.increaseY(10)
    axis.decreaseY(5)
    axis.y shouldEqual 5
  }

  "The axis class" should "increase the z points" in {
    val axis = new Axis()
    axis.increaseZ(10)
    axis.z shouldEqual 10
  }

  "The axis class" should "decrease the z points" in {
    val axis = new Axis()
    axis.increaseZ(10)
    axis.decreaseZ(5)
    axis.z shouldEqual 5
  }

  "The axis class" should "divide x by a default value" in {
    val axis = new Axis()
    axis.increaseX(10)
    axis.divX() shouldEqual 5
  }

  "The axis class" should "divide y by a default value" in {
    val axis = new Axis()
    axis.increaseY(10)
    axis.divY() shouldEqual 5
  }

  "The axis class" should "divide z by a default value" in {
    val axis = new Axis()
    axis.increaseZ(10)
    axis.divZ() shouldEqual 5
  }

  "The axis class" should "show an history of ins for x" in {
    val axis = new Axis()
    axis.increaseX(10)
    axis.increaseHistoryX() shouldEqual List(0)
    axis.increaseX(20)
    axis.increaseHistoryX() shouldEqual List(0,10)
    axis.increaseX(30)
    axis.increaseHistoryX() shouldEqual List(0,10,30)
  }

  "The axis class" should "show an history observable of ins for x" in {
    val axis = new Axis()
    axis.increaseX(10)
    axis.increaseX(20)
    axis.increaseX(30)
    axis.observableHistoryOfIncreasedX().map(v => v*2).toBlocking.toList shouldEqual List(0,20,60)
  }

  "The axis class" should "show an history observable of ins for y" in {
    val axis = new Axis()
    axis.increaseY(10)
    axis.increaseY(20)
    axis.increaseY(30)
    axis.observableHistoryOfIncreasedY().map(v => v*2).toBlocking.toList shouldEqual List(0,20,60)
  }

  "The axis class" should "show an history of ins for y" in {
    val axis = new Axis()
    axis.increaseY(10)
    axis.increaseHistoryY() shouldEqual List(0)
    axis.increaseY(20)
    axis.increaseHistoryY() shouldEqual List(0,10)
    axis.increaseY(30)
    axis.increaseHistoryY() shouldEqual List(0,10,30)
  }

  "The axis class" should "show an history of ins outs for z" in {
    val axis = new Axis()
    axis.increaseZ(10)
    axis.increaseHistoryZ() shouldEqual List(0)
    axis.increaseZ(20)
    axis.increaseHistoryZ() shouldEqual List(0,10)
    axis.increaseZ(30)
    axis.increaseHistoryZ() shouldEqual List(0,10,30)
  }

  "The axis class" should "show an history of outs for x" in {
    val axis = new Axis()
    axis.increaseX(10)
    axis.decreaseX(5)
    axis.decreaseHistoryX() shouldEqual List(0,5)
    axis.increaseX(20)
    axis.decreaseX(10)
    axis.decreaseHistoryX() shouldEqual List(0,5,15)
  }

  "The axis class" should "show an history of outs for y" in {
    val axis = new Axis()
    axis.increaseY(10)
    axis.decreaseY(5)
    axis.decreaseHistoryY() shouldEqual List(0,5)
    axis.increaseY(20)
    axis.decreaseY(10)
    axis.decreaseHistoryY() shouldEqual List(0,5,15)
  }

  "The axis class" should "show an history of outs for z" in {
    val axis = new Axis()
    axis.increaseZ(10)
    axis.decreaseZ(5)
    axis.decreaseHistoryZ() shouldEqual List(0,5)
    axis.increaseZ(20)
    axis.decreaseZ(10)
    axis.decreaseHistoryZ() shouldEqual List(0,5,15)
  }

  "The edge class" should "have their own axis positions" in {
    val edge = new Edge()
    edge.x shouldEqual 0
    edge.y shouldEqual 0
    edge.z shouldEqual 0
  }

  "The edge class" should "have a first axis" in {
    val edge = new Edge()
    edge.first.x shouldEqual 0
    edge.first.y shouldEqual 0
    edge.first.z shouldEqual 0
  }

  "The edge class" should "have a last axis" in {
    val edge = new Edge()
    edge.last.x shouldEqual 0
    edge.last.y shouldEqual 0
    edge.last.z shouldEqual 0
  }

  "The face class" should "have their own axis positions" in {
    val face = new Face()
    face.x shouldEqual 0
    face.y shouldEqual 0
    face.z shouldEqual 0
  }

  "The face class" should "have their top with axis instantiated" in {
    val face = new Face()
    face.top.first.x shouldEqual 0
    face.top.first.y shouldEqual 0
    face.top.first.z shouldEqual 0
    face.top.last.x shouldEqual 0
    face.top.last.y shouldEqual 0
    face.top.last.z shouldEqual 0
  }

  "The face class" should "have their left with axis instantiated" in {
    val face = new Face()
    face.left.first.x shouldEqual 0
    face.left.first.y shouldEqual 0
    face.left.first.z shouldEqual 0
    face.left.last.x shouldEqual 0
    face.left.last.y shouldEqual 0
    face.left.last.z shouldEqual 0
  }

  "The face class" should "have their bottom with axis instantiated" in {
    val face = new Face()
    face.bottom.first.x shouldEqual 0
    face.bottom.first.y shouldEqual 0
    face.bottom.first.z shouldEqual 0
    face.bottom.last.x shouldEqual 0
    face.bottom.last.y shouldEqual 0
    face.bottom.last.z shouldEqual 0
  }

  "The face class" should "have their right with axis instantiated" in {
    val face = new Face()
    face.right.first.x shouldEqual 0
    face.right.first.y shouldEqual 0
    face.right.first.z shouldEqual 0
    face.right.last.x shouldEqual 0
    face.right.last.y shouldEqual 0
    face.right.last.z shouldEqual 0
  }

  "The draw class" should "have choices" in {
    val draw = new Draw()
    draw.choice(0) shouldEqual "square"
    draw.choice(1) shouldEqual "circle"
    draw.choice(2) shouldEqual "triangle"
  }

  "The face class" should "have a default draw" in {
    val face = new Face()
    face.drawFormatIndex shouldEqual 0
    face.drawFormatName shouldEqual "square"
  }

  "The rotation class" should "have a degree" in {
    val rotation = new Rotation()
    rotation.degree shouldEqual 0
  }

  "The rotation class" should "be increase" in {
    val rotation = new Rotation()
    rotation.degree shouldEqual 0
    rotation.increase(10)
    rotation.degree shouldEqual 10
    rotation.increase(20)
    rotation.degree shouldEqual 30
  }

  "The rotation class" should "be decrease" in {
    val rotation = new Rotation()
    rotation.increase(50)
    rotation.degree shouldEqual 50
    rotation.decrease(25)
    rotation.degree shouldEqual 25
    rotation.decrease(5)
    rotation.degree shouldEqual 20
  }

  "The rotation class" should "have increased states" in {
    val rotation = new Rotation()
    rotation.increase(10)
    rotation.increasedStates shouldEqual List(0)
    rotation.increase(20)
    rotation.increasedStates shouldEqual List(0,10)
    rotation.increase(30)
    rotation.increasedStates shouldEqual List(0,10,30)
  }

  "The rotation class" should "have decreased states" in {
    val rotation = new Rotation()
    rotation.increase(10)
    rotation.increasedStates shouldEqual List(0)
    rotation.increase(20)
    rotation.increasedStates shouldEqual List(0,10)
    rotation.decreasedStates shouldEqual List(0)
    rotation.decrease(5)
    rotation.decreasedStates shouldEqual List(0,30)
  }

  "The rotation class" should "have an observable increased states" in {
    val rotation = new Rotation()
    rotation.increase(10)
    rotation.increase(15)
    rotation.increase(5)
    rotation.observableIncreasedStates().map(v => v*2).toBlocking.toList shouldEqual List(0,20,50)
  }

  "The rotation class" should "have an observable decreased states" in {
    val rotation = new Rotation()
    rotation.increase(10)
    rotation.decrease(5)
    rotation.increase(20)
    rotation.decrease(5)
    rotation.increase(10)
    rotation.decrease(5)
    rotation.observableDecreasedStates().map(v => v*2).toBlocking.toList shouldEqual List(0,20,50,60)
  }

  "The clock class" should "have default points" in {
    val clock = new Clock()
    clock.x shouldEqual 0
    clock.y shouldEqual 0
    clock.z shouldEqual 0
  }

  "The clock class" should "have a degree for a rotation" in {
    val clock = new Clock()
    clock.rotation.degree shouldEqual 0
  }

  "The feet class" should "have axis points" in {
    val feet = new Feet()
    feet.x shouldEqual 0
    feet.y shouldEqual 0
    feet.z shouldEqual 0
  }

  "The clock measurement class" should "be flexible for clocks" in {
    val clockMeasurement = new ClockMeasurement()

    clockMeasurement.first.x shouldEqual 0
    clockMeasurement.first.y shouldEqual 0
    clockMeasurement.first.z shouldEqual 0
    clockMeasurement.first.rotation.degree shouldEqual 0

    clockMeasurement.second.x shouldEqual 0
    clockMeasurement.second.y shouldEqual 0
    clockMeasurement.second.z shouldEqual 0
    clockMeasurement.second.rotation.degree shouldEqual 0
  }

  "The clock feet measurement class" should "be flexible for clock and feet" in {
    val clockFeetMeasurement = new ClockFeetMeasurement()

    clockFeetMeasurement.first.x shouldEqual 0
    clockFeetMeasurement.first.y shouldEqual 0
    clockFeetMeasurement.first.z shouldEqual 0

    clockFeetMeasurement.second.x shouldEqual 0
    clockFeetMeasurement.second.y shouldEqual 0
    clockFeetMeasurement.second.z shouldEqual 0
  }

  "The feet measurement class" should "be flexible for feets" in {
    val feetMeasurement = new FeetMeasurement()

    feetMeasurement.first.x shouldEqual 0
    feetMeasurement.first.y shouldEqual 0
    feetMeasurement.first.z shouldEqual 0

    feetMeasurement.second.x shouldEqual 0
    feetMeasurement.second.y shouldEqual 0
    feetMeasurement.second.z shouldEqual 0
  }

  //"The axis class" should "show decreased values without increased ones" in {
  //  val neseq: Observable[Int] = Observable.from(1 to 15000)

  //  neseq.map(v => v * 1) subscribe { v =>
  //    if (v % 2 == 0 && v % 3 == 0) {
  //      println(s"$v is multiple of two and three")
  //    } else if (v % 2 == 0) {
  //      println(s"$v is multiple of two")
  //    } else if (v % 3 == 0) {
  //      println(s"$v in multiple of three")
  //    } else {
  //      println(s"$v")
  //   }
  //  }
  //}
}
