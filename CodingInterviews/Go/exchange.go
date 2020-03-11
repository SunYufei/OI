package main

import "fmt"

func exchange(nums []int) []int {
	var l = 0
	var r = len(nums) - 1

	for l < r {
		for nums[l]%2 == 1 && l < r {
			l = l + 1
		}
		for nums[r]%2 == 0 && l < r {
			r = r - 1
		}
		nums[l], nums[r] = nums[r], nums[l]
	}

	return nums
}

func main() {
	var nums = []int{1, 2, 3, 4}
	fmt.Println(exchange(nums))
}
