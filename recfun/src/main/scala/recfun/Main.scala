package recfun

object Main {
  def main(args: Array[String]) {
//    println("Pascal's Triangle")
    //    for (row <- 0 to 10) {
    //      for (col <- 0 to row)
    //        print(pascal(col, row) + " ")
    //      println()
    //    }

    println(balance(":-)".toList))
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
       if(c== 0) 1
       else if (r == 0) 0
       else pascal(c-1, r-1) + pascal(c, r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def helper(open: Int, chars: List[Char]) : Boolean = {
        if(chars.isEmpty) return open == 0
        else if (chars.head == '(') helper(open + 1, chars.tail)
        else
          if (chars.head == ')')  open > 0 && helper(open - 1, chars.tail)
          else helper(open, chars.tail)
      }
      helper(0, chars)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if(money == 0) 1
      else if (money > 0 && !coins.isEmpty)
        countChange(money-coins.head, coins.tail) + countChange(money, coins.tail)
      else 0
    }
  }
