package org.ess

import scala.annotation.tailrec

@main def Tescalor(args: String*): Unit =
  println(args.mkString(", "))
  println(Tescal.sumLength(args))


object Tescal:
  def sumLength(strs: Seq[_]): Int =
    @tailrec
    def sum(strs: Seq[_], acc: Int): Int = strs match
      case Nil => acc
      case _ :: tail => sum(tail, acc+1)

    sum(strs, 0)

  def sumCollection(strs: Seq[Double]): Double =
    @tailrec
    def sum(strs: Seq[Double], acc: Double): Double = strs match
      case Nil => acc
      case hd :: tail => sum(tail, acc+hd)

    sum(strs, 0)

  def mean(sq: Seq[Double]): Double =
    sumCollection(sq) / sumLength(sq)