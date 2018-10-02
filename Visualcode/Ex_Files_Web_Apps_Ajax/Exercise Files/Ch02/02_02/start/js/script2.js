"use strict";

(function() {
	var url = "http://api.openweathermap.org/data/2.5/weather?q=London,England";
	var apiKey = "cda1a876566d364505cb74f09cccfe82"; // Replace "APIKEY" with your own API key; otherwise, your HTTP request will not work
	var httpRequest;
	makeRequest();

	function makeRequest()
	{
		httpRequest = new XMLHttpRequest();
		httpRequest.onreadystatechange = responseMethod;
		httpRequest.open('GET',url+'&appid='+apiKey);
		httpRequest.send();
	}

	function responseMethod()
	{
		if(httpRequest.readyState===4)
		{	
			console.log(httpRequest.resposeText);
		}
	}
})();
