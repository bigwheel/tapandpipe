package com.github.bigwheel.util

import org.scalatest.FlatSpec

class ChainingOpsTest extends FlatSpec {
  import com.github.bigwheel.util.chaining._

  "AnyTap" should "work correctly" in {
    var x: Int = 0
    val result = List(1, 2, 3)
      .tap(xs => x = xs.head)

    assert(1 == x)
    assert(List(1, 2, 3) == result)
  }


  "AnyValTap" should "work correctly" in {
    assert(42.tap(x => x) == 42)
  }

  "AnyPipe" should "work correctly" in {
    val times6 = (_: Int) * 6
    val result = (1 - 2 - 3)
      .pipe(times6)
      .pipe(scala.math.abs)

    assert(24 == result)
  }

}
