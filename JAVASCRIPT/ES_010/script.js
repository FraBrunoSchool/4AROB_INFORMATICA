function draw() {
    let body = document.getElementsByTagName('body')[0]

    let canvas = document.createElement('canvas')
    let ctx = canvas.getContext("2d")
    body.appendChild(canvas)
    canvas.style.border = "1px solid black"
    canvas.style.width = "500px"
    canvas.style.height = "250px"
    let c = new Cerchio(ctx, canvas.width/2, canvas.height/2, 152,228,0, 10)
    c.disegna()

    let b = document.createElement('br')
    body.appendChild(b)

    let canvas2 = document.createElement('canvas')
    let ctx2 = canvas2.getContext("2d")
    body.appendChild(canvas2)
    canvas2.style.border = "1px solid black"
    canvas2.style.width = "500px"
    canvas2.style.height = "250px"
    let cerchio = new Cerchio (ctx2, canvas2.width/2,canvas2.height/2,255,0,0)
    cerchio.disegna()

    var cerchi = []
    for(let k=0; k<10;k++){
        aggiungiCerchio(ctx2,cerchi)
    }
    d(cerchi)
}

function aggiungiCerchio(ctx2, cerchi){
    let r = casuale(0,255);
    let g = casuale(0,255);
    let b = casuale(0,255);
    let raggio = casuale(2,40)
    let x = casuale(0,ctx2.canvas.width)
    let y = casuale(0,ctx2.canvas.height)
    cerchi.push(new Cerchio(ctx2, x, y, r, g, b, raggio))
}

function d(cerchi){
    for (let el in cerchi)
        cerchi[el].disegna()
}

function casuale(min, max){
    return parseInt(Math.random() * (max-min+1))+ min
}

