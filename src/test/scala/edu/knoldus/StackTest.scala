package edu.knoldus
import org.scalatest.flatspec.AnyFlatSpec

import scala.sys.error

class StackTest extends AnyFlatSpec {
  val obj=new Generic
  "Condition" should  "give true if stack is Empty" in{
    assert(obj.isEmpty==true)
  }
  "Condition" should " provide top element in stack" in {
    obj.push(8)
    obj.push(9)
    assert(obj.top==9)
  }
  "condition" should "Pop element from stack" in{
    obj.push(4)
    obj.push(3)
    obj.push(8)
    obj.push(9)
    obj.pop()
    assert(obj.top==8)
  }
}
