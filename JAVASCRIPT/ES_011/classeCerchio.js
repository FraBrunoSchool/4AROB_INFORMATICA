function Cerchio(ctx, x=0, y=0, r, g, b, radius){
	this.ctx = ctx;	//l'unico obbligatorio
	this.x = x;	//se non specificato ha il valore di default 0
	this.y = y; //se non specificato ha il valore di default 0
	this.r = (r==undefined || r<0 || r>255? 0: r); //undefined viene considerato ==0
	this.b = (b==undefined || b<0 || b>255? 0: b);
	this.g = (g==undefined || g<0 || g>255? 0: g);
	this.radius = (radius==undefined || radius<0? 10: radius);
	//console.log(this)
	
	this.show = function(){
		//this.ctx.clearRect(0,0,this.ctx.canvas.width, this.ctx.canvas.height)
		this.ctx.beginPath()
		this.ctx.fillStyle = "rgba("+this.r+","+this.g+","+this.b+",0.5)" //"rgba(255,0,0,0.5)"
		this.ctx.arc(this.x, this.y, this.radius, 0, Math.PI *2, true) //disegna un cerchio completo
		this.ctx.fill()
		this.ctx.closePath()
	}
}


