/*
P03 (*) Find the Kth element of a list.
By convention, the first element in the list is element 0.
Example:

scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
 */

object P03_200624 {
  val list = List(1, 1, 2, 3, 5, 8)

  def nth[A](n: Int, list: List[A]): A = {
    list(n)
  }
  val result1 = nth(2, list)
  println(s"result1 = ${result1}")
}


object P03_200621 {
  val list = List(1, 1, 2, 3, 5, 8)


  def nth[A](index: Int, list: List[A]) = {
    list(index)
  }
  val result1 = nth(2, list)
  println(s"result1 = ${result1}")

}

object aa {
  val line = ("AAAAAAAA").toList

  def validatePassword[A](list: List[A]) = {
    list match {
      case x::xs if (xs.contains(x)) => println("OK")
      case _ => println("NG")
    }
  }


  println(validatePassword(line))
}