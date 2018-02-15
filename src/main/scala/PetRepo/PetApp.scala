package PetRepo

import models.Dog
import models.Cat
//import models.
import models.Other
import repositories.PetRepository

object PetRepo extends App {

  val pets = PetRepository.all()
  println(pets)

  val dog = Dog("dog", "Lassie", 4)
  PetRepository.add(dog)
  println(PetRepository.all())

  val cat = Cat("cat", "Tiddles", 5)
  val cat2 = Cat("cat", "Moggie", 6)

  PetRepository.add(cat)
  println(PetRepository.all())
  println(PetRepository.other())

  val other = Other("cow", "Daisy", 22, "moo")
  PetRepository.add(other)

  println(PetRepository.other())


  // val dogs = for (i <- 1 to 5) yield Dog(s"$i",4)
  // PetRepository.add(dogs: _*)
  //  val dogs1 = for (i <- 1 to 5) yield Dog(s"$i",4)


  //  println(PetRepository.all())
  val x = PetRepository.findByName("Tiddles")
  if (x.isDefined) {
    println(x.get)
  } else
    None


  println(PetRepository.removeByName("Tiddles"))
  println(PetRepository.all())
  PetRepository.add(Other("Snake", "Sammy", 33, "Hisssss"))
  println(PetRepository.all())
  println(PetRepository.other())
  println(PetRepository.removeByName(""))
}
