import models.{Account, Biller}

import scala.collection.mutable

object InMemoryDB {
  val accountList: mutable.Set[Account] = mutable.Set()
  val accountBillerMapper: mutable.Map[Account, List[Biller]] => mutable.Map[Account, List[Biller]] = mutable.Map[Account,List[Biller]]
}
