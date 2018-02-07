package PetRepo.repositories

import PetRepo.models.Pet

import scala.collection.mutable.ArrayBuffer

object PetRepository {

  private val _pets : ArrayBuffer[Pet] = new ArrayBuffer[Pet]()
  def all() : List[Pet] = _pets.toList

  def findByName(name: String) : Option[Pet] = None

  def dogs() : List[Pet] = _pets.toList

  def cats() : List[Pet] = _pets.toList

  def other() : List[Pet] = _pets.toList

  def add(pet : Pet*) : List[Pet] = {
    // _pets.++=(pet)
    pet.foreach(p=> _pets.+=(p))
    all
  }

  def removeByName(name : String) : List[Pet] =_pets.toList

  def update(pet: Pet) : List[Pet] = _pets.toList

}
