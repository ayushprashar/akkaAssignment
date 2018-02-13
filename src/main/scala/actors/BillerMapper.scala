package actors

import akka.actor.ActorRef
import models.{Account, Biller}

class BillerMapper extends ActorRef{
  override def receive: PartialFunction[Any, Unit] = {
    case (account: Account ,biller: Biller) =>
  }
}
