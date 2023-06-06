fun main(args: Array<String>) {
    val nums = intArrayOf(1,1,0,1,1,1)
    var cnt: Int = 0
    var answer: Int = 0

    for (u in nums) {
        if (u == 0) {
            cnt = 0
        } else {
            cnt++
        }
        if (cnt > answer) answer = cnt
    }

    print(answer)
}