package Actors

import Services.AccountServices
import Utilities.Account
import akka.actor.Actor
import org.apache.log4j.Logger

import scala.collection.mutable

class AccountGenerator extends Actor {

  var userData : mutable.Set[Account] =  mutable.Set()
  val log: Logger = Logger.getLogger(this.getClass)
  override def receive: PartialFunction[Any, Unit] = {

    case account: Account => userData =  AccountServices.addUser(account,userData)
    case _ => log.info("\nInvalid message,please send an account")
  }


}
