fun main() {
    var gameover: Boolean
    gameover = true
    var cards : Int
    cards = (0..3).shuffled().last()

     while (cards == 0)
     {
         cards = (0..3).shuffled().last()
     }

    println("■■■ Игра Камень-Ножницы-Бумага против рандома ■■■")
    println(" ")
    println("                  Условия игры:")
    println("                 1 - это 'Камень'")
    println("                 2 - это 'Ножницы'")
    println("                 3 - это 'Бумага'")

    while (gameover){
        println(" ")
        print("Введите число по условию игры: ")
        var string1 = readln()
        var move: Int = string1.toInt()
        while (move <= 0 || move >= 4){
            if (move <= 0 || move >= 4){
                println("Error404 (Некоректно введено число). Попробуй ввести число заданное условием задачи")
                println(" ")
                print("Введите число по условию игры: ")
                 string1 = readln()
                 move  = string1.toInt()
            }
        }
        when(move){
            1 -> print("Камень -> ")
            2 -> print("Ножницы -> ")
            3 -> print("Бумага -> ")
        }
        when(cards){
            1 -> println("Камень")
            2 -> println("Ножницы")
            3 -> println("Бумага")
        }
        if(move == cards){
            println("Ничья. Продолжим...")
            //println(" ")
            gameover = true
        }
        if ((move == 1 && cards == 2) || (move == 2 && cards == 3) || (move == 3 && cards == 1)){

            println("Вы победили!")
            println(" ")
            print("Хотите сыграть ещё раз? [y/n] ")
            var dop = readln()
            while (dop != "y" && dop != "n"){
                if (dop != "y" && dop != "n")
                {
                    println("Error404 (Некоректно введено сообщение). Попробуй ввести правильную букву")
                    println(" ")
                    print("Хотите сыграть ещё раз? [y/n] ")
                    dop = readln()
                }
            }
            gameover = dop == "y"
        }
        if ((move == 1 && cards == 3) || (move == 2 && cards == 1) || (move == 3 && cards == 2)) {
            println("Вы проиграли!")
            println(" ")
            print("Хотите сыграть ещё раз? [y/n] ")
            var dop = readln()
            while (dop != "y" && dop != "n"){
                if (dop != "y" && dop != "n")
                {
                    println("Error404 (Некоректно введено сообщение). Попробуй ввести правильную букву")
                    println(" ")
                    print("Хотите сыграть ещё раз? [y/n] ")
                    dop = readln()
                }
            }
            gameover = dop == "y"
        }
        cards = (0..3).shuffled().last()

        while (cards == 0)
        {
            cards = (0..3).shuffled().last()
        }
    }
    println(" ")
    println("☼☼☼ Спасибо за игру! ☼☼☼")
}