
fun main() {
    personsName("Mary")
    personsName("Deng")
    modulus(19,5)
  modulus(41,10)
 var b=addition(48,70)
println(b)
    var c=addition(12,13)
    println(c)
  var d=addition(56,15)
    println(d)
    var e=addition(30,25)
    println(e)
    message()


}
fun personsName( name :String){
    println("Hello"+name)
}
fun modulus(num1:Int,num2:Int){
    var modulus =num1/num2
     println(modulus)
}
fun addition(num1:Int,num2:Int):Int{
    var sum =num1+num2
    return sum
}
fun message(){
    println("I am determined ")
}



