package Services

import Utilities.Account
import org.apache.log4j.Logger

import scala.collection.mutable

object AccountServices {

  val log = Logger.getLogger(this.getClass)
  var count = 0


  def addUser(account: Account,accountHolder: mutable.Set[Account]): mutable.Set[Account] = {
    if (!accountHolder.exists(x => x.userName == account.userName)){
      count+=1
      account.accountNumber = count
      accountHolder += account
    }
    else{
      log.info("Please select different username")
      accountHolder
    }
  }


}
