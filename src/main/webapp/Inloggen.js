document.addEventListener("DOMContentLoaded", () => {
    const loginForm = document.querySelector('#login');
    const signinForm = document.querySelector('#signin');

    document.querySelector("#linkCreateAccount").addEventListener("click", e => {
        e.preventDefault();
        loginForm.classList.add("formHidden");
        signinForm.classList.remove("formHidden");
    });

    document.querySelector('#linkLogin').addEventListener("click", e => {
        e.preventDefault();
        loginForm.classList.remove("formHidden");
        signinForm.classList.add("formHidden");
    });
});