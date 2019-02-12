package com.balancer.data

case class Node (children: List[Node], leaves: List[Int]) {

  def balance(w: Int) : Node = {
    Node(Nil, Nil)
  }
}

