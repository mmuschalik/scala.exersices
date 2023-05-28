
@main def entry(): Unit =
  System.out.println(isInterestingTuple(3, 0, 0, List(-2, -1, -5, -3)))
  return


def  isInterestingTuple(size: Int, count: Int, lastNumber: Int, rest: List[Int]): Boolean =
    rest
      .headOption
      .fold(count >= size)(
        currentItem =>
          count >= size
          || isInterestingTuple(size, count, lastNumber, rest.tail)
          || ((count == 0 || lastNumber < currentItem)
                && isInterestingTuple(size, count + 1, currentItem, rest.tail))
      )



