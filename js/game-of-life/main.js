'use strict'

class Life {

  constructor() {
    this.fields = [[1,2,1,2,1,2,1,2],[1,2,1,2,1,2,1,2],[1,2,1,2,1,2,1,2],[1,2,1,2,1,2,1,2]]
    this.floor = "<div class='floor'></div>"
    this.wall = "<div class='wall'></div>"
  }

  fillFloor() {
    var temp
    for (var y = 0; y < heightInSquares; ++y) {
      temp = "<section>"
      for (var x = 0; x < widthInSquares; ++x) {
        this.fields[y][x] === 1 ? temp += this.floor : temp += this.wall
      }
      temp += "</section>"
      document.querySelector('main').innerHTML += temp
    }
  }
}

const widthInSquares = 18
const heightInSquares = 9

var life = new Life()
life.fillFloor()
