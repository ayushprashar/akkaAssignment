package actors

import services.AccountServices
import models.Account
import akka.actor.Actor
import org.apache.log4j.Logger


class AccountGenerator extends Actor {

  var count = 0

  val log: Logger = Logger.getLogger(this.getClass)

  override def receive: PartialFunction[Any, Unit] = {

    case account: Account =>
      count += 1
      val acc: Account = Account(count,account.accountHolderName,account.address,account.userName,
        account.initialAmount)
      AccountServices.addUser(acc,InMemoryDB.accountList)
    case _ => log.info("\nInvalid message,please send an account")
  }

}
