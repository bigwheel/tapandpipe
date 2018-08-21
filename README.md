# tap and pipe [![Build Status](https://travis-ci.com/bigwheel/tapandpipe.svg?branch=master)](https://travis-ci.com/bigwheel/tapandpipe)

This is backported library of
[Adds tap and pipe by eed3si9n · Pull Request \#7007 · scala/scala](https://github.com/scala/scala/pull/7007)
and
[Tweaks to ChainingOps by dwijnand · Pull Request \#7036 · scala/scala](https://github.com/scala/scala/pull/7036)
for scala 2.12/2.11.

## Installation

tapandpipe is available from maven central.

Latest release: Maven Central

If you use SBT you can include spray-json in your project with

```scala
libraryDependencies += "com.github.bigwheel" %% "tapandpipe" % "1.0"
```

## Usage

```scala
import com.github.bigwheel.util.chaining._

object Main {

  def main(args: Array[String]): Unit = {
    val a = 1
    a.tap(println)

    println(a.pipe(_ + 1))
  }
}
```
