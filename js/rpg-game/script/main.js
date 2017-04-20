'use strict'

class Map {

  constructor() {
    this.fields = Map.generateFields()
    this.floor = "<div class='floor'></div>"
    this.wall = "<div class='wall'></div>"
  }

  static generateFields(fields) {
    if (fields === undefined) {
      fields = []
    }
      for (var i = 0; i < heightInSquares; ++i) {
        if (fields[i] === undefined) {
          fields[i] = []
        }
        for (var j = 0; j < widthInSquares; ++j) {
          var random = 1.1 + Math.random()
          if (fields[i][j] === 1) {
          } else {
            fields[i][j] = Math.floor(random)
          }
        }
      }
      if (Map.isOk(fields)) {
        return fields
      } else {
        Map.generateFields(fields)
      }
      return fields
  }

  static isOk(fields) {
    for (var i = 1; i < fields.length - 1; ++i) {
      for (var j = 1; j < fields[i].length - 1; ++j) {
        var counter = 0
        if (fields[i][j] === 1) {
          if (fields[i-1][j] === 1) {
            ++counter
          }
          if (fields[i+1][j] === 1) {
            ++counter
          }
          if (fields[i][j-1] === 1) {
            ++counter
          }
          if (fields[i][j+1] === 1) {
            ++counter
          }
          if (counter > 1) {
            continue
          } else {
            return false
          }
        }
      }
    }
    return true
  }

  fillFloor() {
    var temp
    for (var i = 0; i < heightInSquares; ++i) {
      temp = "<section>"
      for (var j = 0; j < widthInSquares; ++j) {
        this.fields[i][j] === 1 ? temp += this.floor : temp += this.wall
      }
      temp += "</section>"
      document.querySelector('main').innerHTML += temp
    }
  }

}

const widthInSquares = 18
const heightInSquares = 8
const dimension = 72

var map = new Map()
map.fillFloor()
