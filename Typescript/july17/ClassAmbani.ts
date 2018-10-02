class DhiruBhaiAmbani{
    networth :number;
    segment : string[] = ['retail','textile','petroleum','JIO'];

    constructor (nWorth : number, sgment:string[]){
        this.networth = nWorth;
        this.segment[0] = sgment[0];

        this.segment[1] = sgment[1]; 
    }

    displayProperty(){
        console.log("The DHiruBhai AMbani \n"+"The networh is"+this.networth);
        console.log("the Business Segment is "+this.segment);

    }

}

// class MukeshAmbani extends DhiruBhaiAmbani{

    
   
 
//     displayProperty(){
//         console.log("The MUKESH AMbani \n"+"The networh is"+this.networth+"BILLIONS");
//         console.log("the Business Segment is "+this.segment);

//     }
// }


// class AkashhAmbani extends MukeshAmbani{

//     networth :number ;
//     segment :string[];

//     constructor (networth:number, sgment:string){
       
        
//     }
   
 
//     displayProperty(){
//         console.log("The AKASH AMbani \n"+"The networh is"+this.networth+"BILLIONS");
//         console.log("the Business Segment is "+this.segment);

//     }
// }


let networth : number = 1;
let segment : string[] = ['retial','textile', 'petroleum','JIO'];
for (let i:number = 0;i<segment.length;i++){
 let businessSegment : string[];
 businessSegment[i] = segment[i];
let reliance = new DhiruBhaiAmbani(networth, businessSegment);
reliance.displayProperty();
}
