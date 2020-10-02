function spinWords( inputString ){
  let wordsSplitted = inputString.split(" ");
        let reversedWord="";
        let reversedJoinedWord="";
        let resultReversed=[];
        let resultString="";
        wordsSplitted.forEach(
        function(word, i){
          word.length >= 5 ? resultReversed.push( (reversedWord = word.split("").reverse()).join("") ) : resultReversed.push(word);
        });          
        resultReversed.forEach(function(word, j ){  
                  
                                 // i == resultReversed.length ? null : resultString.concat(word + " ");                                                                  
                                 if(j == resultReversed.length -1 ){
                                   resultString += word;
                                 }else{                                                                   
                                   resultString += word+" ";
                                 }
        });
       
       return resultString;    
}
