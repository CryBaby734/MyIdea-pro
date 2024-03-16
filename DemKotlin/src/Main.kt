import kotlin.text.toInt as toInt1

fun main() {

    val name = getter()
    val age = getAge()

    NameAge(name, age)

  //  println("$name, $age")


}

fun getter(): String?{
    println("Введите имя: ")
    return readLine()
}

fun getAge(): Int?{
    println("Введите возраст: ")
    return readLine()?.toInt1()
}

fun NameAge(name: String?, age: Int?){
    println("Данные пользователя: $name,$age лет")
}