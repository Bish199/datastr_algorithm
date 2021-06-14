function postfixEvaluator(string) {
    let arr=[];
    for(let i of string.split(" ")){
        console.log(isNaN(i));
      if(isNaN(i)){
        let x=arr.pop(i);
        let y=arr.pop(i);
        switch(i){
            case '+': arr.push(x+y);break;
            case '-': arr.push(x-y);break;
            case '*': arr.push(x*y);break;
            case '/': arr.push(Math.floor(y/x));break;
        }
      }else arr.push(parseInt(i));
    }
    return arr.pop();
  }

  let res=postfixEvaluator("2 4 5 + *");
  console.log(res)