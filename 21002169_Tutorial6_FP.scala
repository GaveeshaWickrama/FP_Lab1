var key : Int = 1
var upperOrLower : Int=65
//Here it's set to 65 since this only take UpperCase Letters.If lowercase letters are taken make it 97

object question extends App{

    def encryption(text : String):String={
        if(text==""){
            ""
        }
        else{
            (((text(0)+key-upperOrLower)%26)+upperOrLower).toChar.toString + encryption(text.substring(1))
            
        }
    }
    println(encryption("ABCZ"))


    def decrypt(text : String):String={
      if(text==""){
            ""
        }
        else{
            (((text(0)-key-upperOrLower+26)%26)+upperOrLower).toChar.toString + decrypt(text.substring(1))
            
        }
  


    }
    println(decrypt("BCDA"))

}