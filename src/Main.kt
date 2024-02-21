//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
val name = "Gladwell"
    print("Hello, $name")
    var y=modulus(7.0,5)
    println(y)
    var m=addsum( 6, 5, 3, 4)
    println(m)
    val factabout = ("I love exploring and learning new things")
    println(factabout)
}
fun hello(name:String){
    println("Hello $name")
}
fun modulus(num1:Double, num2:Int):Double{
    var division=num1%num2
    return(division)

}
fun addsum(num1:Int, num2:Int, num3:Int, num4:Int): Int{
    var add=num1+num2+num3+num4
    return(add)
}