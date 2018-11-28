// Request handling
// submitRequest with callback action handler
function submitRequest(url, method, payload, header, callback) {
    // Create a request object
    var xhttp = new XMLHttpRequest();

    // Register the function to be called when server responds
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4) {
            if (this.status == 200) {
                // Parse the JSON response
               
                var result = JSON.parse(this.responseText);
                callback(false, result);
            }

            else {
                callback(this.statusText);
            }
        }
    };

    xhttp.open(method, url, true);
    xhttp.setRequestHeader("Content-type", "application/json");
    if (payload) {

        xhttp.send(JSON.stringify(payload)); // Send the request
    }
    else {
        xhttp.send(); // For get/delete
    }
}

function setAuthToTOkenHeader(header, tokenObj){

var tokenVal = "Bearer "+tokenObj.token;
header.authorization = tokenVal;

}