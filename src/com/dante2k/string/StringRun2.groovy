package com.dante2k.string

def greeting = 'Hello'

greeting <<= ' Groovy'

assert greeting instanceof StringBuffer

greeting << '!'

assert greeting.toString() == 'Hello Groovy!'

greeting[1..4] = 'i'

assert greeting.toString() == 'Hi Groovy!'

