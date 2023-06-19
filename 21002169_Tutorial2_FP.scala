object q1 extends App{
    var k,i,j:Int=2
    //println(i+k)
    var m,n:Int=5
    var f:Float=12.0
    //printf("%.2f",e)
    var g=4.0f;
    var c='X'

    println(s" a) k + 12 * m = ${k+12*m}")
    println(s" b) m / j = ${m/j}")
    println(s" c) n % j = ${n%j}")
    println(s" d) m / j * j= ${m/j*j}")
    println(s" e) f + 10*5 +g = ${f + 10*5 +g}")
    println(s" f) ++i * n = ${(i+1)*n}")

}

object q2 extends App{

    var a:Int=2 
    var b:Int=3 
    var c:Int=4
    var d:Int=5
    var k:Float=4.3

    println( s" a)  --b * a + c *d--  = ${(b-1)*a+c*(d-1)}");
    println( s" b)  a++ = ${a+1}");
    //println( s" c)  -2 * ( g - k ) +c = ${-2*(g-k)+c}");
    println( s" d)  c = c++ = ${c+1}");
    println( s" e)  c = ++c * a++ = ${(c+1)*(a+1)}");

}


object q3 extends App{
    
    def normalWorking(amount : Int):Double= 250*amount
    def OThrs(amount : Int):Double=80*amount
    def tax(salary : Double):Double=(12.0/100)*salary
    //println((12.0/100.0)*(normalWorking(40)+OThrs(30)))
    println(s"Total take home salary is ${normalWorking(40)+OThrs(30)-tax(normalWorking(40)+OThrs(30))}")
}

object q4 extends App{

    def calAttendees(tPrice : Int )=120 + (15-tPrice)/5*20
    def revenue(tPrice : Int)=calAttendees(tPrice)*tPrice
    def cost(tPrice : Int)=500+calAttendees(tPrice)
    def profit(tPrice : Int)=revenue(tPrice)-cost(tPrice)

    //calling the above functions for all prices given

    println(s"When the ticket price is 40 profit is ${profit(40)}" )
    println(s"When the ticket price is 35 profit is ${profit(35)}" )
    println(s"When the ticket price is 30 profit is ${profit(30)}" )
    println(s"When the ticket price is 25 profit is ${profit(25)}" )
    println(s"When the ticket price is 20 profit is ${profit(20)}" )
    println(s"When the ticket price is 15 profit is ${profit(15)}" )
    println(s"When the ticket price is 10 profit is ${profit(10)}" )
    println(s"When the ticket price is  5 profit is ${profit(5)}" )

    println (s"The most pofitable ticket price is 25")


}