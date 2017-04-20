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
        var random = 1.5 + Math.random()
        if (fields[i][j] === 1) {
        } else {
          fields[i][j] = Math.floor(random)
        }
      }
    }
    Map.filter(fields)
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

  static filter(fields) {
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
          if (counter <= 1) {
            fields[i][j] = 2
          } else {
            continue
          }
        }
      }
    }
    return fields
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

  renderHero(hero) {
    document.querySelector('main').innerHTML += "<div class='hero'><img src='img/" + hero.costume + ".png'></div>"
    document.querySelector('.hero').style.top = hero.positionX * dimension + "px"
    document.querySelector('.hero').style.left = hero.positionY * dimension + "px"
  }
}

class Hero {
  constructor() {
    this.positionX = 0
    this.positionY = 0
    this.costume = "hero-down"
  }
}

const widthInSquares = 18
const heightInSquares = 8
const dimension = 72

var map = new Map()
var hero = new Hero()
map.fillFloor()
map.renderHero(hero)

var heroOnTheMap = document.querySelector('.hero')

document.onkeydown = checkKey;

function checkKey(e) {

    if (e.keyCode == '40') {
      hero.costume = "hero-down"
      ++hero.positionX
      heroOnTheMap.style.top = hero.positionX * dimension + "px"
    }
    else if (e.keyCode == '38') {
      hero.costume = "hero-up"
      --hero.positionX
      heroOnTheMap.style.top = hero.positionX * dimension + "px"
    }
    else if (e.keyCode == '39') {
      hero.costume = "hero-right"
      ++hero.positionY
      heroOnTheMap.style.left = hero.positionY * dimension + "px"
    }
    else if (e.keyCode == '37') {
      hero.costume = "hero-left"
      --hero.positionY
      heroOnTheMap.style.left = hero.positionY * dimension + "px"
    }
    document.querySelector('.hero').innerHTML = "<img class='hero' src='img/" + hero.costume + ".png'>"
}
