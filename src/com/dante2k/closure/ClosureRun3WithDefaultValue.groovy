package com.dante2k.closure

// Default 값을 가지는 Closure 호출하기
def adder2 = { x, y=7 -> return x + y }

assert adder2(3, 4) == 7
assert adder2(3) == 10
assert adder2.call(2) == 9