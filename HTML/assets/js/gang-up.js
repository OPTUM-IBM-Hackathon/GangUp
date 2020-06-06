var getInvites = function() {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("demo").innerHTML = this.responseText;
		}
	};
	var name = document.getElementById('name').value;
	var emailId = localStorage.getItem("emailId");
	var story = document.getElementById('story').value;
	var data = JSON.stringify({
		"name" : name,
		"emailId" : emailId,
		"story" : story
	});
	xhttp.open("POST", "http://localhost:8081/story", true);
	xhttp.setRequestHeader("Content-type", "application/json");
	xhttp.send(data);
	
	alert("Your story is posted successfully");
}

