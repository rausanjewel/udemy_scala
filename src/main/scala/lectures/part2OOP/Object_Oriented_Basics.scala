package lectures.part2OOP

object Object_Oriented_Basics extends App {

  val person = new Person("John", 26)
  println(person.age)
  println(person.x)
  person.greet()
}

// constructor
// class parameters are different than class fields, class
// fields are members of a class, parameters are not.
class Person(name: String, val age: Int = 0) {
  // body
  val x = 2
  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading, methods with same name but different signatures
  def greet(): Unit = println(s"Hi, I am $name")
  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}
// value of the code block or body of a class is ignored,
// it refers to the implementation of the class
// val or var definitions inside the class implementation
// are fields