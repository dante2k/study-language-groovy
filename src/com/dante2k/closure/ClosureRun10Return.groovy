package com.dante2k.closure

def list = [1, 2, 3].collect { return it * 2 }
println list

def list2 = [1, 2, 3].collect { it * 2 }
println list2

def list3 = [1, 2, 3].collect {
  if (it % 2 == 0) return it * 2
  return it
}
println list3