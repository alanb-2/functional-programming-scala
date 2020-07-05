package chapter4

object Maths {

  def mean(xs: Seq[Double]): Option[Double] = {
    if (xs.isEmpty) None
    else Some(xs.sum / xs.length)
  }

  def variance(xs: Seq[Double]): Option[Double] = {
    mean(xs).flatMap(m =>
      mean(xs.map(x => (x - m)*(x - m)))
    )
  }

}