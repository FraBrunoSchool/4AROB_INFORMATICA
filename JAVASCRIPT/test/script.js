$(document).ready(function(){
    let b = document.getElementsByTagName('body')[0]
    let p = document.createElement('p')
    b.appendChild(p)
    // jQuery methods go here...
    console.log("funziona?")
    $("p").append("Some appended text.");
    $("p").prepend("Some prepended text.");

});