package PetRepo.repositories

import PetRepo.models.{Cat, Dog, Pet}
import scala.collection.mutable.ArrayBuffer


object PetRepository {

  private val _pets: ArrayBuffer[Pet] = new ArrayBuffer[Pet]()

  def all(): List[Pet] = _pets.toList

  def findByName(name: String): Option[Pet] = {
    _pets.find(p => p.name == name)

  }

  def dogs(): List[Dog] =
    _pets.toList.flatMap {
      case d@Dog(_, _, _) => Some(d)
      case _ => None

    }

  def cats(): List[Cat] =
    _pets.toList.flatMap {
      case c@Cat(_, _,_) => Some(c)
      case _ => None
    }


  def other(): List[Pet] =
    _pets.toList.flatMap {
      case _@Cat(_, _,_) => None
      case _@Dog(_, _,_) => None
      case o => Some(o)

    }

  def add(pet: Pet*): List[Pet] = {

    pet.foreach(p => _pets.+=(p))
    all()
  }

  def removeByName(name: String): List[Pet] = {

    _pets.toList.filter(pet => pet.name != name)
    all()
  }

    def update(pet: Pet): List[Pet] =  {
    all()
         }
   }










