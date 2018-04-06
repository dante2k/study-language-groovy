package com.dante2k.closure

[1, 2, 3].each { entry -> println entry }

// 100 명의 손님이 잔을 모두 부딧치는 횟수
def totalClinks = 0
def partyPeople = 100
1.upto(partyPeople) { guest ->
  def guestClinks = guest - 1
  totalClinks += guestClinks
}

assert totalClinks == (partyPeople * (partyPeople - 1)) / 2

println "Total clinks $totalClinks"