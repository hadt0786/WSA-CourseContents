/* Loop thru the keys */

var personJSON = {
    "name": "Mubeen",
    "id": 10,
    "height": 5.7
};

// Loop thru the keys
for (var key in personJSON) {
    console.log(key, personJSON[key]);
}

// for (var key in personJSON) {
//     if (personJSON.hasOwnProperty(key)) {
//         console.log(key, personJSON[key]);
//     }
// }