package org.ess

import scala.annotation.tailrec

@main def Tescalor(args: String*): Unit =
  println(args.mkString(", "))
  println(Tescal.sumCollection(args))


object Tescal:
  def sumCollection(strs: Seq[_]): Int =
    @tailrec
    def sum(strs: Seq[_], acc: Int): Int = strs match
      case Nil => acc
      case _ :: tail => sum(tail, acc+1)

    sum(strs, 0)