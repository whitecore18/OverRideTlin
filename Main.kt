//Задача 2: Функция для поиска самого длинного слова в массиве строк
fun findLongestWord(words: Array<String>): Pair<String, Int> {
    var longestWord = ""
    for (word in words) {
        if (word.length > longestWord.length) {
            longestWord = word
        }
    }
    return Pair(longestWord, longestWord.length)
}

//Задача 3: Функция для поиска символов в верхнем регистре
fun findUpperCaseCharacters(input: String): Pair<List<Char>, Int> {
    val upperCaseChars = input.filter { it.isUpperCase() }.toList()
    return Pair(upperCaseChars, upperCaseChars.size)
}

// Основная функция
fun main() {
    //Задача 1: Пример использования класса Bird и его наследников
    val pelican = Pelican()
    pelican.describe()

    val flamingo = Flamingo()
    flamingo.describe()

    val ostrich = Ostrich()
    ostrich.describe()

    //Задача 2: Поиск самого длинного слова
    val words = arrayOf("яблоко", "банан", "груша", "арбуз", "киви")
    val (longestWord, length) = findLongestWord(words)
    println("Самое длинное слово: $longestWord, количество букв: $length")

    //Задача 3: Поиск символов в верхнем регистре
    val inputString = "ПриВет, кАк деЛа"
    val (upperCaseChars, count) = findUpperCaseCharacters(inputString)
    println("Символы в верхнем регистре: $upperCaseChars, их количество: $count")
}