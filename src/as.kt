import java.time.temporal.TemporalAmount

fun main() {
    println(writer(listOf(Book("born a crime","trevor noah",234),
        Book("a crime"," noah",234),
        Book("MAry","trevor",278),
    )))
    println(square())
    var current=CurrentAccount(2345,"rytiy",573.00)
    println(current.deposit(23.00))
    println(current.withdraw(34.00))


}
data class Book(var title:String,var Author:String,var pages:Int)
fun writer(books:List<Book>):List<Book>{
    var arranged=books.sortedBy{ book ->book.title  }
    return arranged
}
fun square(){
    var number=1
    do {
        print("number1*3000")
    }while (number<=3000)
}
open class CurrentAccount( var accountNumber:Int,var accountName:String,var balance:Double){
    fun deposit(amount:Double):Double{
        balance=balance+amount
        return balance
    }
    fun withdraw(amount: Double):Double{
        balance=balance-amount
        return  balance
    }


}
class Savings( accountNumber:Int, accountName:String, balance:Double,var withdrawals:Int):CurrentAccount(accountNumber, accountName, balance){

}