var height = window.innerHeight
var width = window.innerWidth
var score = 0
var defaultTime = 5000
var remainingTime
var bomb = ""
var timerModifier
var timer

document.querySelector('#box').addEventListener("click", click)
document.querySelector('#bomb').addEventListener("click", explode)
document.querySelector('#candy').addEventListener("click", candy)

function click() {
  clearTimeout(timer)
  remainingTime = defaultTime - 1.45**timerModifier
  timer = setTimeout(explode, remainingTime)
  document.querySelector('#box').style.top = getRandomIntInclusive(0, height) + "px"
  document.querySelector('#box').style.left = getRandomIntInclusive(0, width) + "px"
  document.querySelector('#bomb').classList.remove('hidden')
  document.querySelector('#bomb').style.top = getRandomIntInclusive(0, height) + "px"
  document.querySelector('#bomb').style.left = getRandomIntInclusive(0, width) + "px"
  document.querySelector('#candy').classList.remove('hidden')
  document.querySelector('#candy').style.top = getRandomIntInclusive(0, height) + "px"
  document.querySelector('#candy').style.left = getRandomIntInclusive(0, width) + "px"
  score++
  document.querySelector('.counter').innerHTML = score
  timerModifier++
}

function explode() {
  document.querySelector('#box').classList.add("hidden")
  document.querySelector('#bomb').classList.add('hidden')
  document.querySelector('#candy').classList.add('hidden')
  document.querySelector('.buttons').classList.remove('hidden')
  document.querySelector('#start').innerHTML = "PLAY AGAIN"
  document.querySelector('#submit').innerHTML = "SUBMIT ( " + score + " )"
}

function candy() {
  document.querySelector('#candy').classList.add('hidden')
  score++
  document.querySelector('.counter').innerHTML = score
}

function getRandomIntInclusive(min, max) {
  min = Math.ceil(min)
  max = Math.floor(max)
  return Math.floor(Math.random() * (max - min + 1)) + min
}

function start() {
    timerModifier = 0
    score = 0
    document.querySelector('.buttons').classList.add("hidden")
    document.querySelector('#box').classList.remove("hidden")
  }
