package exercise.part2OOP

object Object_oriented_basics extends App {
  val author = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val counter = new Counter

  counter.inc(3).dec.print()
}

    /*
      Create two new Class named Novel and Writer
      Writer: first name, last name, year of birth
      - method fullName
      Novel: name, year of release, author
      - authorAge
      - isWrittenBy(author)
      - copy (new year of release) => new instance of Novel

      */
class Writer(fName: String, sName: String, val age: Int) {
      def fullName: String = fName + " " + sName
    }

class Novel(name: String, releaseYr: Int, author: Writer) {

  def authorAge: Int = releaseYr - author.age

  def isWrittenBy(author: Writer): Boolean = author == this.author

  def copyRelease(newReleaseYr: Int): Novel = new Novel(name, newReleaseYr, author)
}
      /*
      Counter class:
        - receives an int value
        - method current count
        - method to increment/decrement => new Counter
        - overload increment/decrement which receives a int value
       */
class Counter(val count: Int = 0){

        def inc: Counter = {
          println("Incrementing")
          new Counter(count + 1)
        }
        def dec: Counter = {
          println("Decrementing")
          new Counter(count - 1)
        }

        def inc(n: Int): Counter = {
          if(n <= 0) this
          else inc.inc(n - 1)
        }

        def dec(n: Int): Counter = {
          if(n <= 0) this
          else dec.dec(n - 1)
        }

        def print(): Unit = println(count)
      }