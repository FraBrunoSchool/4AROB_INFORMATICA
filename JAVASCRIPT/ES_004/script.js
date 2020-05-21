<<<<<<< HEAD
function Termometro() {
    this.temperatura = 0
    this.misura = function(temp){
        if (temp && !isNaN(temp)) this.temperatura = temp
    }
    this.Celcius = () => this.temperatura
    this.fahrenheit = () => this.temperatura*9/5+32
    this.tipo = function () {
        if (this.temperatura>45) return "Molto Caldo"
        if (this.temperatura<=45 && this.temperatura>35) return "Caldo"
        if (this.temperatura<=35 && this.temperatura>18) return "Ottimale"
        if (this.temperatura<=18 && this.temperatura>0) return "Freddo"
        if (this.temperatura<=0) return "Molto Freddo"
    }
}

var t1 = new Termometro();
t1.misura(21)
alert(t1.temperatura)
alert(t1.Celcius())
alert(t1.fahrenheit())
alert(t1.tipo())
=======
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
>>>>>>> cb38da23bc4d73f452ebafff05c41ae4ed012c4e
