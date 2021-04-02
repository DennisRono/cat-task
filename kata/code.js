function denno(x){
    let j = (x.length/3-2)*3;
    x.sort();
    x.reverse();
    let a = [x[1:j:3],x[2:j:3],x[:j:3]];
  }

  denno([2,4,7,3,2,4,6]);