package models

import java.util.Date

object Category extends Enumeration {
  type Category = Value
  val Phone,Electricity,Internet,Food,Car = Value
}
case class Biller(category: Category.Value,name: String,accountNumber: Int,transactionDate: Date,
                  amount: Float,totalIterations: Int,executedIterations: Int,paidAmount: Float)
