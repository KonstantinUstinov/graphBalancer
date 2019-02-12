package com.balancer.data

import org.scalatest.{FlatSpec, Matchers}

class NodeTest extends FlatSpec with Matchers {

  "Node" should "balance by 3" in {
    val result = Node(List(Node(Nil, Nil), Node(Nil, Nil), Node(Nil, Nil)), List(1, 2, 3, 4)).balance(3)
    result should be ( Node(List(Node(Nil, List(3)), Node(Nil, List(4)), Node(Nil, Nil)), List(1, 2)) )
  }

}
