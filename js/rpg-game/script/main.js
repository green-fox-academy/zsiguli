'use strict'

class Map {

 constructor() {
    this.fields = [[0,1,1,0,1],[0,1,1,0,1],[0,1,1,0,1],[0,1,1,0,1],[0,1,1,0,1]]
    this.floor = "<div class='floor'></div>"
    this.wall = "<div class='wall'></div>"
  }

  fillFloor() {
    var temp
    for (var i = 0; i < heightInSquares; i++) {
      temp = "<section>"
      for (var j = 0; j < widthInSquares; j++) {
        this.fields[i][j] === 0 ? temp += this.floor : temp += this.wall
      }
      temp += "</section>"
      document.querySelector('main').innerHTML += temp
    }
  }
}

const widthInSquares = 5
const heightInSquares = 5
const dimension = 72

var map = new Map()
map.fillFloor()
