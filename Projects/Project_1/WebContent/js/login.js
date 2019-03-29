document.getElementById("Form").onsubmit = () => {
    window.alert(
        "Username: " + document.getElementById("Username").value
        + "\nPassword: " + document.getElementById("Password").value
        + "\nRemeber me?: " + document.getElementById("Remeber").checked
    );
}