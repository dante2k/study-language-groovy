package com.dante2k.closure

assert [1, 2, 3].grep { it % 2 == 1 } == [1, 3]

switch (10) {
  case { it / 2 == 1 }: assert false
    break

  default:
    println 'fall down here'
    assert true
}