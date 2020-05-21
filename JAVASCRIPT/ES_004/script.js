/*
 Disegnare un grafico a barre sul canvas usando come
 base di dati una seriazione numerica contenuta in un array.
*/

var valori = [3, 10, 1, 7, 12]

function disegno() {
  var body = document.getElementsByTagName('body')[0]
  var canvas = document.createElement('canvas')
  body.appendChild(canvas)
  canvas.style.border = "1px solid black"
  canvas.style.width = "300px"
  canvas.style.height = "300px"
  var ctx = canvas.getContext("2d")
  let pos = 25
  for (var v in valori) {
    ctx.fillStyle=getRandomColor()
    ctx.fillRect(pos, 145, 25, -(valori[v]*10))
    pos+=50
  }
  ctx.moveTo(0, 145)
  ctx.lineTo(300, 145)
  ctx.strokeStyle = getRandomColor()
  ctx.stroke()
}

function getRandomColor(){
  let letters = '0123456789ABCDEF'
  let color = '#'
  for (let i = 0; i < 6; i++) color += letters[Math.floor(Math.random() * 16)]
  return color;
}
