package com.dante2k.closure

def foo(n) {
  return { n += it }
}

def accumulator = foo(1)
assert accumulator(3) == 4
assert accumulator(1) == 5