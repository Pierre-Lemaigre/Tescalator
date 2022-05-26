package org.ess

import scala.annotation.tailrec

@main def Tescalor(args: String*): Unit =
  println(args.mkString(", "))
  println(Tescal.sumLength(args))
  println(Tescal.mean(Seq(5, 23, 23.5)))


object Tescal:
  def sumLength(sq: Seq[_]): Int =
    @tailrec
    def sum(sq: Seq[_], acc: Int): Int = sq match
      case Nil => acc
      case _ :: tail => sum(tail, acc + 1)

    sum(sq, 0)

  def sumCollection(sq: Seq[Double]): Double =
    @tailrec
    def sum(sq: Seq[Double], acc: Double): Double = sq match
      case Nil => acc
      case hd :: tail => sum(tail, acc + hd)

    sum(sq, 0)

  def mean(sq: Seq[Double]): Double =
    sumCollection(sq) / sumLength(sq)