import java.util.Random
import kotlin.math.*
fun main(args: Array<String>) {
    //задание 1
    val myAge = 17
    val isTeenager = 13 < myAge && myAge < 19

//задание 2
    val theirAge = 30
    val bothTeenagers = (13 < myAge && myAge < 19) && (13 < theirAge && theirAge < 19)
    print(bothTeenagers)


//задание 3
    val reader = "Виктория"
    val author = "Тетухова"
    val authorIsReader = reader == author
//задание 4
    val readerBeforeAuthor = reader > author

//задание 5
    val myAge2 = 18
    if (myAge2 > 13 && myAge2 < 19) {
        println("Подросток")
    } else
        println("Не подросток")

//задание 6
    val answer = if (myAge2 > 13 && myAge2 < 19) println("Подросток") else println("Не подросток")
    print(answer)

//задание 7
    var counter = 0
    while (counter<10){
        print(counter)
        counter += 1
    }

//задание 8
    var roll = 0
    do {
        roll = Random().nextInt(6)
        counter += 1
        print("После $counter бросков, roll равен\n" +
                "$roll")
    }
    while (roll != 0)

//задание 9
    var range = 1..10
    for ( i in range) {
        println("${i*i}")
        //print(i*i)
    }

//задание 10
    for ( i in range) {
        println("${sqrt(i.toDouble())}")
    }
}