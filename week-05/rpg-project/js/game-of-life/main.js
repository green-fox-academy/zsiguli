'use strict'
var cc = 1
class Life {

  constructor() {
    // this.aliveTabel = [[1,1,2,2,2],[1,1,2,2,2],[2,2,2,2,2],[2,2,2,2,2],[2,2,2,2,2],]
    this.aliveTabel = [[2,2,2,2,2],[2,1,2,2,2],[2,1,2,2,2],[2,1,2,2,2],[2,2,2,2,2],]
    this.floor = "<div class='floor'></div>"
    this.wall = "<div class='wall'></div>"
  }

  live() {
    var temp = this.aliveTabel
    for (var y = 0; y < this.aliveTabel.length; y++) {
      for (var x = 0; x < this.aliveTabel[y].length; x++) {
        var aliveCounter = 0
        var deathCounter = 0
        for (var i = -1; i <= 1; ++i) {
          for (var j = -1; j <= 1; ++j) {
            if (i === 0 && j === 0) {
              continue
            }
            try {
              if (temp[y+i][x+j] === 1) {
                ++aliveCounter
              }
            } catch (e) {
                ++deathCounter
            }
            try {
              if (temp[y+i][x+j] === 2) {
                ++deathCounter
              }
            } catch (e) {
              
            }
          }
        }
        console.log('dead: ' + deathCounter + ', alive: ' + aliveCounter);
        // if (temp[y][x] === 1) {
          // --aliveCounter
        // }
        console.log(cc++ + ': ' + aliveCounter)
        if (temp[y][x] === 1 && (aliveCounter < 2 || aliveCounter > 3)) {
        temp[y][x] = 2
        } else if (temp[y][x] === 2 && aliveCounter === 3) {
          temp[y][x] = 1
        }
      }
    }
    this.aliveTabel = temp
  }

  showState() {
    console.log('showState: ' + this.aliveTabel)
    var temp = ""
    for (var y = 0; y < heightInSquares; ++y) {
      temp += "<section>"
      for (var x = 0; x < widthInSquares; ++x) {
        this.aliveTabel[y][x] === 1 ? temp += this.floor : temp += this.wall
      }
      temp += "</section>"
    }
    document.querySelector('main').innerHTML = temp
  }
}

const widthInSquares = 5
const heightInSquares = 5
var life = new Life()

document.onkeydown = checkKey;

life.showState()
life.live()

function checkKey(e) {
  if (e.keyCode == '32') {
    life.showState()
    life.live()
  }
}
