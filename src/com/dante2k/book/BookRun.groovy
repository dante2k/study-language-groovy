// Book 예제
package com.dante2k.book

Book book = new Book(title: 'Groovy in Action')

assert book.title == 'Groovy in Action'
assert getTitleBackward(book) == 'noitcA ni yvoorG'

static String getTitleBackward(book) {
  def title = book.title
  title.reverse()
}
