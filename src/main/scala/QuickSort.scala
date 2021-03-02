import scala.language.postfixOps

object QuickSort {
  def main(args: Array[String]) = {
    val a = List(5, 3, 2, 1, 20, 6) //
    sort(a).foreach(n=> (print(n), print (" " )))
  }
/*  Sort Function */
  def sort(a:List[Int]): List[Int] =  {
    if (a.length < 2) a
    else {

      val pivot = a(a.length / 2)
      sort (a filter (pivot>)) ++ (a filter (pivot == )) ++  //The filter() method is utilized to select all elements of List
        sort (a filter(pivot <))
    }
  }
}