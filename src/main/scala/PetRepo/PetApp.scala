package PetRepo

import repositories.PetRepository


object PetRepo extends App {

  PetRepository.all()

  val fred = new models.Dog("Fred")
  println(fred)
  val bob = new models.Cat("Bob")
  println(bob)

}