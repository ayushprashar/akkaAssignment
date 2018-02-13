package services

import akka.actor.ActorRef
import models.{Account, Biller}
import org.apache.log4j.Logger

import scala.collection.mutable

object AccountServices {

  val log = Logger.getLogger(this.getClass)

  def addUser(account: Account,accountHolder: mutable.Set[Account]): Unit = {
    if (!accountHolder.exists(x => x.userName == account.userName)){
      accountHolder += account
    }
    else {
      log.info("Please select different username")
      //accountHolder
    }
  }

  def linkBiller(account: Account,biller: Biller,accountBillerMapper: mutable.Map[Account,List[Biller]]): Unit = {
    if (!accountBillerMapper(account).contains(biller)) {
      accountBillerMapper + (account -> (biller :: accountBillerMapper(account)))
    }
    else {
      log.info("\nDuplicate Biller")
    }
  }
  def bangAccount(actorRef: ActorRef,account: Account): Unit = {
    actorRef ! account
  }

}
