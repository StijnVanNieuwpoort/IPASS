function validate() {
    var email=document.getElementById("email").value;
    var wachtwoord=document.getElementById("wachtwoord").value;
    if(email=='admin' && wachtwoord=='admin') {
        alert("Ingelogd");
        return false;
    } else {
        alert("Fout")
    }
}