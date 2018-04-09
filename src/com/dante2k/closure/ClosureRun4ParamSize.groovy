package com.dante2k.closure

// Closure 를 호출하는 파라메터 개수 확인 가능

def caller(Closure closure) {
  closure.getParameterTypes().size()
}

assert caller { one -> } == 1
assert caller { one, two -> } == 2
