package com.dante2k.range

// range 범위

def x = 1..10

assert x.contains(5)

//noinspection GroovyPointlessBoolean
assert x.contains(15) == false

assert x.size() == 10

assert x.from == 1
assert x.to == 10

assert x.min() == 1
assert x.max() == 10

assert x.reverse() == 10..1