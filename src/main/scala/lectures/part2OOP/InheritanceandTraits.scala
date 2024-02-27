package lectures.part2OOP

object InheritanceandTraits extends App {
  class Animal {
    val creatureType: String = "wild"
    def eat: Unit = println("nomnomnom")
  }

  class Cat extends Animal {
    def crunch = {
      super.eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  class Dog(dogType: String) extends Animal {
    //override val creatureType: String = "domestic"
    override val creatureType: String = dogType
    override def eat: Unit = println("crunch crunch")
  }

  val dog = new Dog("K9")

  dog.eat
  println(dog.creatureType)

  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat
}

