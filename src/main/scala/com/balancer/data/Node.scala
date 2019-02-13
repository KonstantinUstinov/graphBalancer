package com.balancer.data

import com.balancer.utils.Utils._

case class Node (children: List[Node], leaves: List[Int]) {

  def balance(w: Int) : Node = {

    Node(Nil, Nil)
  }
}

