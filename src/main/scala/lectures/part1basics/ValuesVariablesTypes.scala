package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 1
  println(x)
  // x = 2 will through an error as a definition using val
  // is immutable (can not be changed)
  // val x: Int = "a string" will through an error because
  // type given is Int but the value is a Sting.

  val y = "a string"
  // type is inferred by the compiler, in this case it is
  // a String
  println(y)

  // type Boolean
  val aBoolean: Boolean = true
  val aCharacter: Char = 'a'
  val anInt: Int = 3
  val aShort: Short = 22222
  val aLong: Long = 222222222L // usually written with a capital L
  // at the end
  val aFloat: Float = 2.5F // written with a capital F
  val aDouble: Double = 2.5

  // variables can be reassigned
  var aVariable: Int = 4
  aVariable = 5 // is ok!

  // variables are side effects as it is mutable or can be changed
  // side effects in scala is very important, side effects are useful
  // because it allows us to see what our program is doing, such as:
  // printing something to the console or displaying something to the
  // screen.

  // Programs without side effects are easier to understand as there
  // are no variables or logic to keep track of. However, side effects
  // can not be eliminated completely because we need our programs to
  // do something to the world.


}
