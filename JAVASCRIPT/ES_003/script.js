var posizioni = {
    "pos_0_0": "Pen",
    "pos_0_1": "Bike",
    "pos_1_0": "Car",
    "pos_1_1": "Smartphone",
    "pos_2_0": "Hat",
    "pos_2_1": "Glassses",
}

var riposizioni = {
    "pos_0_0": "Penna",
    "pos_0_1": "Bici",
    "pos_1_0": "Macchina",
    "pos_1_1": "Telefono",
    "pos_2_0": "Cappello",
    "pos_2_1": "Occhiali",
}

const cambioTesto = (pos) => document.getElementById(pos).innerHTML = posizioni[pos]

const ricambioTesto = (pos) => document.getElementById(pos).innerHTML = riposizioni[pos]