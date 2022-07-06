document.addEventListener("DOMContentLoaded", () => {
    const loginForm = document.querySelector('#loginForm');
    const createAccountForm = document.querySelector('#signinForm');

    document.querySelector("#linkCreateAccount").addEventListener("click", e => {
        e.preventDefault();
        loginForm.classList.add("formHidden");
        createAccountForm.classList.remove("formHidden");
    });

    document.querySelector('#linkLogin').addEventListener("click", e => {
        e.preventDefault();
        loginForm.classList.remove("formHidden");
        createAccountForm.classList.add("formHidden");
    });
});

window.addEventListener("load", event => {
    document.querySelector("#signinButton").addEventListener("click", signinUser)
});

function signinUser() {
    var formSigninData = new FormData(document.querySelector("#signinForm"));
    var encSigninData = new URLSearchParams(formSigninData.entries());

    fetch("/restservices/LoginSignin/signin", {method: "POST", body: encSigninData})
        .then(response => response.json())
        .then(myJson => {
            document.querySelector("#result").textContent = JSON.stringify(myJson);
        });
    // .then(function (response) {
    //     if (response.ok) {
    //         setFormMessage(signinForm,"success", "");
    //         console.log("Sign up succeeded");
    //         setFormMessage(signinForm, "ok", "Your account has been registered");
    //         alert("Your account has been registered");
    //         // window.location.href="home.html";
    //         return response.json();
    //     } else if(response.status === 406){
    //         setFormMessage(signinForm, "error", "Both of the passwords should be the same");
    //         console.log("Sign up Failed");
    //     } else {
    //         setFormMessage(signinForm, "error", "This email already exists");
    //         console.log("Sign up Failed");
    //     }
    // })
    // .then(myJson => console.log(myJson)).catch(error => console.log(error))
}