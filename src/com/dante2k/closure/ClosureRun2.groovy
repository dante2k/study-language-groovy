package com.dante2k.closure

// Closure 호출하기1
def adder = { x, y -> return x + y }

assert adder(3, 4) == 7
assert adder.call(2, 6) == 8

// Closure 호출하기2
static def benchmark(repeat, Closure worker) {
  def start = System.currentTimeMillis()
  repeat.times { worker(it) }
  def stop = System.currentTimeMillis()
  return stop - start
}

slow = benchmark(10000) { (int) it / 2 }
fast = benchmark(10000) { it.intdiv(2) }
assert fast * 2 < slow


