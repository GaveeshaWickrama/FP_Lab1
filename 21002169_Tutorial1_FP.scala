object MyOwn extends App{
    
    def CalArea(r :Int)=math.Pi*r*r
    println("1 ) The area of the disk is"+CalArea(5))
    
    def ConvertToFa(c :Double ) : Double =c* 1.8000 + 32.00
    println("2 ) When converted to Celcius : "+ ConvertToFa(35))
    
    def CalVolume(r :Int)=(4.0/3)*math.Pi*r*r*r//If put 4 answer differs
    println("3 ) The area of the sphere is"+CalVolume(5))

    def TranspotationFee(amount :Int)=3*50+0.75*(amount-50)
    def DiscountedPrice(amount :Int)=24.95*amount*0.6
    def TotalPrice(amount :Int)=TranspotationFee(amount)+DiscountedPrice(amount)
    println("4 ) The Final Wholesale price is " +TotalPrice(60))

    def EasyPaceI(dis :Int)=dis*8
    def TempoPace(dis :Int)=dis*7
    println(s"5 ) The total running time is ${EasyPaceI(2)+TempoPace(3)+EasyPaceI(2)}")
   




}