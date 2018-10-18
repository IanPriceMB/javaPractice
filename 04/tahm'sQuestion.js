//assuming i am being passed a 3d array
//[{x:1,y:1},{x:1,y:2 } ... ] for example

function solution(arr){

    const setOfPoints = new Array;
    //split the array into every conseveable set of 4
    for(let i = 0; i < arr.length; i++){
        for(let j = 1; j < arr.length; j++){
            for(let k = 2; arr.length; k++){
                for(let l = 3; l < arr.lenth; l++){
                    const set = new Array;
                    set.push([arr[i], arr[j], arr[k], arr[l]]);
                    setOfPoints.push(set);
                }
            }
        }
    }

    //find and check the slope and length of each to see if rectangle
    //if yes and bigger than current rect set new rect value
    for(let i = 0; i < setOfPoints.length; i++){
        checkForRect(setOfPoints[i]);
    }

    let rectSize;
    
    return rectSize;

}

//array looks like [{x: y: }, {x: y: }, {x: y: }, {x: y: }]
function checkForRect(arr){
    //get slope
    sideOneSlope =;
    sideOneSlope =;
    sideOneSlope =;
    sideOneSlope =;
};