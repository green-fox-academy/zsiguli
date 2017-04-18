'use strict'

const widthInSquares = 10
const heightInSquars = 6
const dimension = 72

document.querySelector('img').addEventListener("click", fillFloor)

function fillFloor() {
  for (var i = 0; i < widthInSquares; i++) {
    for (var j = 0; j < heightInSquars; j++) {
      document.querySelector('main').innerHTML += "<img src='img/floor.png' alt='floor'>"
    }
  }
}
