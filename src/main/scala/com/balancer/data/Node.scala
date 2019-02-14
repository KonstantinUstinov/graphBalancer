package com.balancer.data

import com.balancer.utils.Utils._

case class Node (children: List[Node], leaves: List[Int]) {

  def balance(w: Int) : Node = {

    leaves.splitByWeight(w, children.length + 1) match {
      case h::t =>
        val ch = children.zipAll(t, Nil, Nil)
          .map(item => Node(item._1.asInstanceOf[Node].children, item._1.asInstanceOf[Node].leaves ::: item._2))
        Node(ch.map(_.balance(w)), h)
      case xs =>
        Node(children, xs.flatten)
    }

  }
}

