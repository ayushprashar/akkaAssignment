import actors.AccountGenerator
import akka.actor.{ActorRef, ActorSystem, Props}

object MainApp{
  def main(args: Array[String]): Unit = {
    val system: ActorSystem = ActorSystem("AccountingSystem")
    val propsAccountGen: Props = Props[AccountGenerator]
    val refAccountGen: ActorRef = system.actorOf(propsAccountGen)
  }
}
