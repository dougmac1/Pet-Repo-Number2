package PetRepo.models

sealed trait Pet  {

  val name: String
  val animalType:String

}

trait Talking {
  def talk: String
}

trait Woof extends Talking {
  override def talk = "woof"
}

trait Meow extends Talking {
  override def talk: String = "meow"
}


final case class Other(override val animalType:String, name: String, age: Int, talk:String) extends Pet  with Talking{
  override def toString: String = s"The $animalType's name is $name and it goes $talk and is it $age years old!"
}

final case class Dog(override val animalType:String,name: String, age: Int) extends Pet  with Woof {
  override def toString: String = s"The dog's name is $name and is says $talk and it is $age years old!"
}

final case class Cat(override val animalType:String,name: String, age: Int) extends Pet with Meow {
  override def toString: String = s"The cat's name is $name and it goes $talk and it is $age years old"
}
//final case class Cow(override val name: String, age: Int) extends Pet  with Moo{
//  override def toString: String = s"The Cows name is $name and it goes $talk"
//}
