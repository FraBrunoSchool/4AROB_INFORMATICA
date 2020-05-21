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