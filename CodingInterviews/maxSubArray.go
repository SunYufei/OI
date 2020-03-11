package main

import "math"

func maxSubArray(nums []int) int {
	var res = math.MinInt64
	var sum = 0

	for i := 0; i < len(nums); i++ {
		sum += nums[i]
		if sum > res {
			res = sum
		}

		if sum < 0 {
			sum = 0
		}
	}

	return res
}

func main() {
	println(maxSubArray([]int{-2, 1, -3, 4, -1, 2, 1, -5, 4}))
}
