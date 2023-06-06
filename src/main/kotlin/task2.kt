fun main(args: Array<String>){
    var nums = intArrayOf(100000)
    var answer = 0
    for (x in nums.indices){
        var cnt = 1
        while (nums[x] >= 10){
            nums[x] = nums[x]/10
            println(nums[x])
            cnt++
        }
        println(cnt)
        if (cnt % 2 == 0) answer++
    }
    print(answer)
}


