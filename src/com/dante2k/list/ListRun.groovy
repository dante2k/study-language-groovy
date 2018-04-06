package com.dante2k.list

// index      0   1     2     3      4    5    6      7
def roman = ['', 'I', 'II', 'III', 'IV', 'V', 'VI', 'VII']

assert roman[4] == 'IV'

// 동적으로 배열 사이즈 증가
roman[8] = 'VIII'

assert roman.size() == 9