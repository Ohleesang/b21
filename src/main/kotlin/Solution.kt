
//짝수와 홀수 구분지어서 출력
class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val evenNum =
            num_list.count { it % 2 == 0 }
        val oddNum =
            num_list.count { it % 2 != 0 }
        answer = intArrayOf(evenNum,oddNum)
        return answer
    }
}
fun main(){
    Solution().solution(intArrayOf(1,2,3,4,5))//2,3
    Solution().solution(intArrayOf(1,3,5,7))//0,4
}