package com.balancer.utils

object Utils {

  implicit class IntList(list: List[Int]) {

    def splitByWeight(weight : Int, maxSize : Int) : List[List[Int]] = {
      (list foldLeft (0, Nil.asInstanceOf[List[List[Int]]])) ((x, y) => x match {
        case (v, l::xs) if v+y <= weight  => (v+y, (y::l)::xs)
        case (_, xs) => (y, (y::Nil)::xs)
      })._2.reverse.foldLeft (0, Nil.asInstanceOf[List[List[Int]]])((x, y) =>  x match {
        case (m, h::t)  if m >= maxSize => (m+1, (y:::h)::t)
        case (v, xs) => (v+1,  y::xs)
      })._2.reverse.map(x => x.sorted)
    }

  }

}
