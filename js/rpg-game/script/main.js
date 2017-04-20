'use strict'

const widthInSquares = 18
const heightInSquares = 8
const dimension = 72
const floor = "<div class='floor'></div>"
const wall = "<div class='wall'></div>"

function fillFloor() {
  var temp
  for (var i = 0; i < heightInSquares; i++) {
    temp = "<section>"
    for (var j = 0; j < widthInSquares; j++) {
      var random = .3 + Math.random()
      if ((i === 0 && j === 0) || (i === 0 && j === 1) || (i === 1 && j === 0)) {
        temp += floor
      } else if (random < 1) {
        temp += floor
      } else {
        temp += wall
      }
    }
    temp += "</section>"
    document.querySelector('main').innerHTML += temp
  }
}
fillFloor()
