fun main(){
println(numbers(arrayOf(12,2,3,4,)))
    println(mixed(arrayOf("Efy",2.3,1,1.0,"class")))
    println(words(arrayOf('l','o','v','e','a','i','u')))
}
fun numbers(num: Array<Int>):Int{
    var product=1
    num.forEach { numb->
        product*=numb

    }
return product
}

fun mixed(number:Array<Any>):Double{
    var sum=0.0
    number.forEach { name->
        if (name is Float||name is Double)
            sum+=name.toString(). toDouble()

    }
    return sum
}
fun words(house:Array<Char>) : Int{
    var count=0
    house.forEach { name->
        if (name=='a'||name=='e'||name=='i'||name=='o'||name=='u')
            count++
    }
    return count

}