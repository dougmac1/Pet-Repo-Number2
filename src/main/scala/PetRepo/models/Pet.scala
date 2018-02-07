package PetRepo.models

trait Pet {
  val name: String
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
final class Dog (override val name :String) extends Pet with Talking with Woof{

  override def toString =s"Dogs name:$name goes $talk"
}
final class Cat (override val name :String) extends Pet with Talking with Meow{

  override def toString =s"Cats name:$name goes $talk"
}