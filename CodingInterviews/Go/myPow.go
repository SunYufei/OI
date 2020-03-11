package main

import "fmt"

func myPow(x float64, n int) float64 {
	if n == 0 {
		return 1
	}
	if n < 0 {
		x = 1 / x
		n = -n
	}

	var res = 1.0

	for n > 0 {
		if n&1 == 1 {
			res *= x
		}
		x *= x
		n = n >> 1
	}

	return res
}

func main() {
	fmt.Println(myPow(2, 10))
}
