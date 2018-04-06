package com.dante2k.book

// GString 예제
// " 큰 따옴표 안의 내용에 변수를 사용할 수 있음
def nick = 'dante2k'
def bookName = 'Groovy in Action'

assert "$nick has $bookName" == 'dante2k has Groovy in Action'