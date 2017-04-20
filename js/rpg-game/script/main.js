'use strict'

const widthInSquares = 18
const heightInSquares = 8
const dimension = 72

function fillFloor() {
  var temp
  for (var i = 0; i < heightInSquares; i++) {
    temp = "<section>"
    for (var j = 0; j < widthInSquares; j++) {
      temp += "<div></div>"
    }
    temp += "</section>"
    document.querySelector('main').innerHTML += temp
  }
}
fillFloor()
