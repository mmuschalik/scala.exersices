
@main def entry(): Unit =
  System.out.println(isInterestingTuple(3, List(-2, -1, -5, -3)))

def isInterestingTuple(size: Int, numbers: List[Int]): Boolean =
  isInterestingTuple(size, 0, 0, numbers)

def isInterestingTuple(size: Int, count: Int, lastNumber: Int, rest: List[Int]): Boolean =
  rest
    .headOption match
      case None => count >= size
      case Some(currentItem) =>
          count >= size
          || isInterestingTuple(size, count, lastNumber, rest.tail)
          || ((count == 0 || lastNumber < currentItem)
                && isInterestingTuple(size, count + 1, currentItem, rest.tail))
