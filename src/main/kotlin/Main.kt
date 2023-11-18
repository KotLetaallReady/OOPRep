package main.kotlin

object Main {
    // 1 задание я вам сдавал, кода не осталось, но если надо могу написать
    @JvmStatic
    fun main(args: Array<String>) {
        //secondTask();
        //thirdTask();
        fourthTask()
    }

    fun secondTask() {
        val input = "inputs"
        val index = input.length / 2
        println(input[index - 1].toString() + input[index].toString())
    }

    fun thirdTask() {
        val input = "1213 ffr jjjj wadjk "
        var numbDifferent = 0
        var minDifferent = Double.POSITIVE_INFINITY
        var index = 0
        val Words = input.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        for (i in Words.indices) {
            for (j in 0 until Words[i].length - 1) {
                if (Words[i][j] != Words[i][j + 1]) {
                    numbDifferent++
                }
            }
            if (numbDifferent < minDifferent) {
                minDifferent = numbDifferent.toDouble()
                index = i
            }
            numbDifferent = 0
        }
        println(Words[index])
    }

    fun fourthTask() {
        val input = "One two three раdfз д2ва три one two2 123"
        var count = 0
        var flag = true
        val list = input.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        for (i in list.indices) {
            flag = true
            for (j in 0 until list[i].length) {
                if (list[i][j].code < 65 || list[i][j].code > 122 || list[i][j].code > 90 && list[i][j].code < 97) {
                    flag = false
                }
            }
            if (flag) {
                count++
            }
        }
        println(count)
    }
}