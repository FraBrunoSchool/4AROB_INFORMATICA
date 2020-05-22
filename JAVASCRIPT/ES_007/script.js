function Obj1() {
  this.val = 0;
  this.vett = [];
  this.object = {
    uno: 1,
    due: "due"
  }
  this.altro = 'non cambia'
  this.somma = function() {
    s = 0
    for (el of this.vett)
      s += el
    return s
  }
}

function Obj2() {
  this.val = 10;
  this.vett = [1, 2];
  this.object = {
    uno: 1,
    due: "due"
  }
  this.inPiu = 3
  this.somma = function() {
    s = 0
    for (el of this.vett)
      s -= el
    return s
  }
}

var obj1 = new Obj1();
var obj2 = new Obj2();

console.log(obj1)
console.log(obj1.somma())
obj1 = Object.assign(obj1, obj2)
console.log(obj1)
console.log(obj1.somma())
