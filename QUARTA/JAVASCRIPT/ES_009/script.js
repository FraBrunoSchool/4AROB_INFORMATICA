function Sollevatore() {
    this.corpo = {"x": 150, "y": 125, "w": 50, "h": 10}
    this.cabina = {"x": 150, "y": 115, "w": 15, "h": 10}
    this.ruotaAnt = {"x": 160, "y": 135}
    this.ruotaPost = {"x": 190, "y": 135}
    this.sollevatore = {"x": 145, "y": 135, "alt": 90}
    this.forca = {"x": 145, "y": 135, "larg": 125}
    this.min_altezza = 135
    this.max_altezza = 90
    this.disegnaRettangoli = function () {
        // rettaongolo orizzontale
        ctx.rect(this.corpo.x, this.corpo.y, this.corpo.w, this.corpo.h)
        ctx.fill()
        ctx.stroke()
        // rettaongolo verticale
        ctx.rect(this.cabina.x, this.cabina.y, this.cabina.w, this.cabina.h)
        ctx.fill()
        ctx.stroke()
    }
    this.disegnaRuote = function () {
        // ruota anteriore
        ctx.arc(this.ruotaAnt.x, this.ruotaAnt.y, 5, 0, Math.PI)
        ctx.fill()
        ctx.stroke()
        // ruota posteriore
        ctx.arc(this.ruotaPost.x, this.ruotaPost.y, 5, 0, Math.PI)
        ctx.fill()
        ctx.stroke()
    }
    this.disegnaParteDavanti = function () {
        // sollevatore
        ctx.moveTo(this.sollevatore.x, this.sollevatore.y)
        ctx.lineTo(this.sollevatore.x, this.sollevatore.alt)
        ctx.fill()
        ctx.stroke()
        // forca
        ctx.moveTo(this.forca.x, this.forca.y)
        ctx.lineTo(this.forca.larg, this.forca.y)
        ctx.fill()
        ctx.stroke()
    }
    this.disegna = function () {
        ctx.clearRect(0,0,canvas.width, canvas.height)
        this.disegnaRettangoli()
        ctx.beginPath()
        this.disegnaRuote()
        this.disegnaParteDavanti()
        ctx.beginPath()
    }
    this.sinistra = function () {
        this.forca.larg-=10
        if(this.forca.larg>=0){
            this.corpo.x-=10
            this.cabina.x-=10
            this.ruotaAnt.x-=10
            this.ruotaPost.x-=10
            this.sollevatore.x-=10
            this.forca.x-=10
            this.disegna()
        }else this.forca.larg+=10
    }
    this.destra = function () {
        this.corpo.x+=10
        if (this.corpo.x+this.corpo.w<canvas.width){
            this.cabina.x+=10
            this.ruotaAnt.x+=10
            this.ruotaPost.x+=10
            this.sollevatore.x+=10
            this.forca.x+=10
            this.forca.larg+=10
            this.disegna()
        } else this.corpo.x-=10
    }
    this.alza = function () {
        this.forca.y -= 10
        if (this.forca.y>=this.max_altezza) this.disegna()
        else this.forca.y += 10
    }
    this.abbassa = function () {
        this.forca.y += 10
        if (this.forca.y<=this.min_altezza) this.disegna()
        else this.forca.y -= 10
    }
}

var soll = new Sollevatore()
var canvas = document.createElement('canvas')
var ctx = canvas.getContext("2d")

function draw() {
    var body = document.getElementsByTagName('body')[0]
    body.appendChild(canvas)
    canvas.style.border = "1px solid black"
    canvas.style.width = "500px"
    canvas.style.height = "500px"
    soll.disegna()
}

const sinistra = () => soll.sinistra()
const destra = () => soll.destra()
const alza = () => soll.alza()
const abbassa = () => soll.abbassa()



