package com.dante2k.map

// list 와 동일한 방법으로 맵에 접근 가능
// list map array 를 일관된 방식으로 접근 가능

def httpStatus = [
    100 : 'CONTINUE',
    200 : 'OK',
    400 : 'BAD REQUEST',
]

assert httpStatus[200] == 'OK'

httpStatus[500] = 'INTERNAL SERVER ERROR'

assert httpStatus.size() == 4