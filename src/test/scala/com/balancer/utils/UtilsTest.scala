package com.balancer.utils

import org.scalatest.{FlatSpec, Matchers}
import com.balancer.utils.Utils._

class UtilsTest extends FlatSpec with Matchers {

  "Utils" should "split tBy Weight" in {
    List(1, 2, 3, 4).splitByWeight(3, 3) should be (List(List(1, 2), List(3), List(4)))

    List(1, 2, 3, 4).splitByWeight(10 , 1) should be (List(List(1, 2, 3, 4)))

    List(1, 2, 3, 4, 5).splitByWeight(3 , 3) should be (List(List(1, 2), List(3), List(4, 5)))
  }

}
