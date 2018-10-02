/******************************************************************************
+   Description : Arrow function usage inside class 
+   Author      : WebStack Academy (P) Limited
+   Date        : 20/01/2018
/******************************************************************************/

class Kalaa {

    actorName: string; 
    punchDiag: string; 
    boxOffice: number; 
    
    setPunch = (bOffice: number) => {
        this.actorName = 'Rajinikanth';
        this.punchDiag = 'Kya re...setting ah?';
        this.boxOffice = bOffice; 
    }
}

var newMovie = new Kalaa();

newMovie.setPunch(200);

console.log ("Actor Name -->" + newMovie.actorName);
console.log ("Punch Dialogue -->" + newMovie.punchDiag);
console.log ("Box office collection --> " + newMovie.boxOffice + " Crores");