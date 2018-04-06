package com.dante2k.number

println 1 / 2
assert 1 / 2 instanceof BigDecimal

def zero = (int) (1 / 2)
println zero

assert ((int) (1 / 2)) instanceof Integer

println Integer.MAX_VALUE + 1

println 1.1F == 1.1G

println((100 / 34).setScale(0, BigDecimal.ROUND_HALF_UP))

// step
store = ''
0.step(0.5, 0.1) { number ->
  store += number + ' '
}
println store

def sum = 0
[1, 2, 3].stream().filter { number -> number != 2 }.each { number -> sum += number }
println sum