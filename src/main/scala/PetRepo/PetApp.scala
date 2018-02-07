package PetRepo

import models.Dog

import repositories.PetRepository

object PetRepo extends App {

  val pets = PetRepository.all
  println(pets)
//create a dog
  val dogs = for (i <- 1 to 5) yield new Dog(s"Dog $i")
  //Add pets
  PetRepository.add(dogs: _*)

  // remove pets

  //List all()pets in repo(after list populated
    val p2 =PetRepository.all
  println(p2)
}
