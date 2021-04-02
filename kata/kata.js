// var username = document.querySelector('#userid').value;
// var email = document.querySelector('#emailid').value;
// var password = document.querySelector('#passid').value;
let username = "Peshy"
let email = "ryan@gmail.com"
let password = "peshy254"
let biddingid           = '';
function makeid(length) {

  let characters       = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
  let charactersLength = characters.length;
  for ( var i = 0; i < length; i++ ) {
    biddingid += characters.charAt(Math.floor(Math.random() * charactersLength));
  }
  return biddingid;
}

makeid(6);



// document.querySelector('.form').addEventListener('submit', (e) =>{

const fs = require('fs')

function loadJSON(filename = ''){
  return JSON.parse(
    fs.existsSync(filename)
    ? fs.readFileSync(filename).toString()
    : '""'
  )
}

console.log(loadJSON('data.json'));

function saveJSON(filename = '', json = '""'){
  return fs.writeFileSync(filename, JSON.stringify(json, null, 2))
}

const data = loadJSON('data.json')
let qualified = false
for (let i = 0; i < data.main.length; i++) {
  let loop = data.main[i];
  if (email != loop.email && biddingid != loop.biddingid){
    qualified = true
  } else {
    qualified = false
    i = data.main.length + 1;
  }  
}

if (qualified){
data.main.push({"useraname": username, "email": email, "password": password, "biddingid": biddingid})
} else {
  console.log('You are alredy registered to the system');
}


saveJSON('data.json', data)

//   e.preventDefault()
// });
