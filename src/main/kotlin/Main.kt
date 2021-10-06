fun main(args: Array<String>){

//    var person1 = Person()
//    var person2 = Person()
//    var person3 = Person()
//
//    person1.name = "Николай"
//    person1.surname = "Иванов"
//    person1.age  = 16
//    person1.showInfo()
//    person1.welcome("Привет!")
//    person1.checkTakeLoan()
//
//    person2 = person1.clone()
//
//    person2.name = "Иван"
//    person2.showInfo()
//    person1.showInfo()

//    var note = Notebook()
//    note.setData(1)
//
//    println(person1.laptopFits(note))

//    var laptops = ArrayList<Notebook>()
//
//    for (i in 1..2){
//        var newLaptop = Notebook()
//        newLaptop.setData(i)
//        laptops.add(newLaptop)
//    }
//
//    println(person1.laptopsFit(laptops))

    var tester = InterviewTester()
    tester.start()

}

class Person{
    var name: String = ""
    var surname: String = ""
    var age: Int = 0

    fun showInfo(){
        println("$name $surname $age")
    }

    fun welcome(greeting: String){
        println("$greeting $name $surname")
    }

    fun checkTakeLoan(){

        if (age >= 18){
            println("$name, Вы можете взять кредит!")
        }
        else{
            println("$name, пока наслаждайтесь жизнью без кредита)")
        }
    }

    fun clone() : Person{
        var clonePerson = Person()
        clonePerson.name = name
        clonePerson.surname = surname
        clonePerson.age = age
        return clonePerson
    }

    fun isAdult() : Boolean{
        return (age >= 18)
    }

    fun laptopFits(laptop: Notebook) : Boolean{
        return laptop.brand == "Apple" && laptop.ram >= 16 && laptop.capacity >= 256
    }

    fun laptopsFit(laptops: ArrayList<Notebook>) : ArrayList<Notebook>{
        var res = ArrayList<Notebook>()

        for (comp in laptops){
            if (comp.capacity > 250){
                res.add(comp)
            }
        }
        return res
    }
}

class Notebook{
    var brand: String = ""
    var model: String = ""
    var screenDiagonal: Float = 0.0f
    var proc: String = ""
    var ram: Int = 0
    var capacity: Int = 0

    fun setData(number: Int){
        println("Укажите брэнд ноутбука №${number}?")
        brand = readLine().toString()
        println("Укажите модель ноутбука №${number}?")
        model = readLine().toString()
        println("Укажите диагональ?")
        screenDiagonal = readLine().toString().toFloat()
        println("Укажите название процессора №${number}?")
        proc = readLine().toString()
        println("Сколько оперативной памяти №${number}?")
        ram = readLine().toString().toInt()
        println("Обьем внутренней памяти №${number}?")
        capacity = readLine().toString().toInt()
    }

    fun showInfo(){
        println("$brand, $model, $screenDiagonal, $proc, $ram, $capacity")
    }
}

class InterviewTester(){
    var questions = arrayListOf(
        "Знаете ли вы что такое переменная?",
        "Знаете ли вы что такое ветвления if?",
        "Знаете ли вы что такое ветвления when?",
        "Знаете ли вы что такое циклы?",
        "Знаете ли вы что такое массивы?",
        "Как величить массив?",
        "Можно ли сдлать без циклов?"
    )

    private fun makeInterview() : BooleanArray{
        var answers = BooleanArray(questions.size){false}

        for (questionIndex in questions.indices){
            print(questions[questionIndex] + ":")

            var answer = readLine()

            if (answer == "+"){
                answers[questionIndex] = true
            }
            else if (answer == "-"){
                answers[questionIndex] = false
            }
            else{
                println("Ошибка! Программа не может обработать эти данные")
                println("Тест провален")
                break
            }
        }

        return answers
    }

    fun start(){
        var answers = makeInterview()
        var count = 0
        for (isCorrectAnswer in answers){
            if (isCorrectAnswer){
                count++
            }
        }

        if (count >= 4){
            println("Прекрасно! Вы прошли тест, теперь вы можете работать программистом")
        }
        else{
            println("Вам нужно подтянуть следующие вопросы:")

            for (answerIndex in answers.indices){
                if (!answers[answerIndex]){
                    println(questions[answerIndex])
                }
            }
            println("Выучите ответы на вопросы и приходите в следующий раз")
        }
    }
}

// Задание на уроке №1
// Создать класс Money для работы с денежными суммами. Число должно быть представлено двумя полями: количество рублей и копеек
// Дробная часть при выводе на экран должна быть отделена от целой части запятой. Реализовать сложение, вычитание, деление и
// умножение сумм на дробное число и операции сравнения

// ДЗ: Создать класс Fraction для работы с дробными числами. Число должно быть представлено двумя полями: целая часть - длинное целое со знаком,
// дробная часть - беззнаковое короткое целое. Реализовать арифметические операции сложения, вычитания, умножения, и операции сравнения
