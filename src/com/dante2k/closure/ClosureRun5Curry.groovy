package com.dante2k.closure

// 인자가 2개인 Closure
def adder = { x, y -> return x + y }
// 왼쪽 인자를 1로 설정한 Closure 를 만든다.
def addOne = adder.curry(1)

// addOne 호출 시 인자가 y 자리에 들어가는 것을 확인하라
assert addOne(2) == 3
