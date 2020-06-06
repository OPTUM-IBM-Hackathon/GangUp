function openForm() {
  document.getElementById("myForm").style.display = "block";
}

function closeForm() {
  document.getElementById("myForm").style.display = "none";
}

function saveEmailId() {
	var emailId = document.getElementById('email').value;
	localStorage.setItem('emailId', emailId);
	document.getElementById("login").style.display = "none";
	document.getElementById("logout").style.display = "block";
	document.getElementById('email').value = "";
	document.getElementById("greet").innerText = 'Hi ' + emailId;
	closeForm();
}

function logout()
{
	localStorage.setItem('emailId', "");
	document.getElementById("login").style.display = "block";
	document.getElementById("logout").style.display = "none";
	document.getElementById("greet").innerText = 'please login';

}