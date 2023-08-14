object q1 extends App{

 val calculateInterest: Int => Double = {
    case amount if amount <= 20000 => amount * 0.02
    case amount if amount <= 200000 => amount * 0.04
    case amount if amount <= 2000000 => amount * 0.035
    case amount => amount * 0.065
  }
  
    val amount = 600000
    
    println(calculateInterest(amount))
}







object q2 extends App{

val classifyNumber: Int => String = num => num match {
    case n if n < 0 => "Negative is input"
    case n if n == 0 => "Zero is input"
    case n if n % 2 == 0 => "Positive Even number is given"
    case _ => "Positive Odd number is given"
  }

val a = scala.io.StdIn.readInt()
println(classifyNumber(a))

}





object q3 extends App{

val toUpper: String => String = s => s.toUpperCase;

val toLower: String => String = s => s.toLowerCase;

val formatNames: String => (String => String) => String = name => formatter => formatter(name);
val Benny = "Benny";
val Niroshan = "Niroshan"; 
val Saman = "Saman";
val Kumara = "Kumara"; 
println(formatNames(Benny)(toUpper));
println(formatNames(Niroshan.take(2))(toUpper)+formatNames(Niroshan.drop(2))(toLower));
println(formatNames(Saman)(toLower));

println(formatNames(Kumara.take(1))(toUpper)+formatNames(Kumara.drop(1).take(4))(toLower)+formatNames(Kumara.drop(5))(toUpper));





}