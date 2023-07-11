object question1 extends App{
    
    def gcd(a:Int,b:Int):Int=if (b==a) a else if (a>b) gcd(b,a-b) else  gcd(a,b-a)
        

    // println(GCD(1000,3))
    // println(GCD(3,1000))
    // println(GCD(5,2))

    def isPrime(n:Int,x:Int=2):Boolean=x match {
        case x if (x==n) => true  
        case x if (gcd(x,n) == 1) => isPrime(n,x+1)
        case x if (gcd(x,n) > 1) => false
    }

    println(isPrime(2))
    println(isPrime(9))
    println(isPrime(7))



   
}

object question2 extends App{

    def gcd(a:Int,b:Int):Int=if (b==a) a else if (a>b) gcd(b,a-b) else  gcd(a,b-a)
    def isPrime(n:Int,x:Int=2):Boolean=x match {
        case x if(x==n) => true  
        case x if (gcd(x,n)==1) => isPrime(n,x+1)
        case x if (gcd(x,n)>1) => false
    }
    def primeSeq(i:Int):Unit=
        if (i>=2 && isPrime(i)==true) println (i)
        if(i>2) primeSeq(i-1)
    
    primeSeq(10)
}


object question3 extends App{
    def getCount(n:Int):Int=
        if (n==0) n
        else n+getCount(n-1)

    println(getCount(15))
}

object question4 extends  App{
    def isOddOrEven(n:Int):Unit={
        if (n==0) println("Not a number")
        else if (isOdd(n)) println("Odd")
        else println("Even")
    }

    def isOdd(n:Int):Boolean=
        if(n==1) true
        else !(isOdd(n-1))

    println(isOddOrEven(10))
    println(isOddOrEven(0))
    println(isOddOrEven(11))
}

object question5 extends App{
    def getCal(n:Int):Int=n match{
        case n if (n == 0) => 0
        case n if (n%2==0)=>(n-2)+getCal(n-2)
        case n if (n%2==1)=>(n-1)+getCal(n-1)
    }
    //def sum(n:Int):Int=n+sum(n-2)

    println(getCal(10))
    println(getCal(9))

}
object question6 extends App{
        def fib(n:Int)=n match{
        case 0 => 0
        case 1 => 1
        case _: Int =>  fib(n-1)+fib(n-2)
    }



    println(fib(7))
}
