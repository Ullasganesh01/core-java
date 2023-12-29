function handleRadioClick(value) {
    
    var loginIdInput = document.getElementById('loginId');
    if (value === 'yes') {
        var emailInput = document.getElementById('emailId');
        loginIdInput.value = emailInput.value;
        loginIdInput.readOnly = true;
    } else {
        loginIdInput.readOnly = false;
    }

}

function validateFName(){
    let nameEle = document.getElementById("firstName");
    let name = nameEle.value.trim();
    let nameErr = document.getElementById("fnameError");
    let isNameValid = false;
    const nameRegex = /^[a-zA-Z]+( [a-zA-Z]*)*$/;
    if(name===" " || name.length<3){
        nameErr.innerHTML = "Must be at least 3 characters";
        nameEle.style.border = "2px solid red";
        nameErr.style.display = "inline";
        isNameValid = false;
    }else if(!nameRegex.test(name)){
        nameErr.innerHTML = "Must contain only alphabets";
        nameEle.style.border = "2px solid red";
        nameErr.style.display = "inline";
        isNameValid = false;
    }else{
        nameErr.style.display = "none";
        nameEle.style.border = "2px solid green";
        isNameValid = true;
    }
    return isNameValid;
}

function validateSurname(){
    let nameEle = document.getElementById("surname");
    let name = nameEle.value.trim();
    let nameErr = document.getElementById("surnameError");
    let isNameValid = false;
    const nameRegex = /^[a-zA-Z]+( [a-zA-Z]*)*$/;
    if(name===" " || name.length<2){
        nameErr.innerHTML = "Must be at least 2 characters";
        nameEle.style.border = "2px solid red";
        nameErr.style.display = "inline";
        isNameValid = false;
    }else if(!nameRegex.test(name)){
        nameErr.innerHTML = "Must contain only alphabets";
        nameEle.style.border = "2px solid red";
        nameErr.style.display = "inline";
        isNameValid = false;
    }else{
        nameErr.style.display = "none";
        nameEle.style.border = "2px solid green";
        isNameValid = true;
    }
    return isNameValid;
}

function validateEmail(){
    let emailEle = document.getElementById("emailId");
    let email = emailEle.value.trim();
    let emailErr = document.getElementById("emailError");
    let isEmailValid = false;
    const emailRegex =/^[^\s@]+@[^\s@]+\.[^\s@]+$/;    
    if(email ===" " || email.length<1){
        emailErr.innerHTML = "Email cannot be empty";
        emailEle.style.border = "2px solid red";
        emailErr.style.display = "inline";
        isEmailValid = false;
    }else if(!emailRegex.test(email)){
        emailErr.innerHTML = "Must be in the format <br> of abc@example.com";
        emailEle.style.border = "2px solid red";
        emailErr.style.display = "inline";
        isEmailValid = false;
    }else{
        emailErr.style.display = "none";
        emailEle.style.border = "2px solid green";
        isEmailValid = true;
    }
    return isEmailValid;
}

function validatePassword() {
    var password = document.getElementById('password');
    var passwordError = document.getElementById('passwordError');
    if (password.value.length<8) {
      password.style.border = "2px solid red";
      passwordError.style.display = 'inline';
      return false;
    } else {
      password.style.border = "2px solid green";
      passwordError.style.display = 'none';
      return true;
    }
  }

  function validateConfirmPassword() {
    var password=document.getElementById('password');
    var cpassword = document.getElementById('confirmPwd');
    var confirmPasswordError = document.getElementById('confirmPassError');
    if (cpassword.value!=password.value) {
      confirmPasswordError.style.display = 'inline';
      cpassword.style.border = "2px solid red";
      return false;
    } else {
      confirmPasswordError.style.display = 'none';
      cpassword.style.border = "2px solid green";
      return true;
    }
  }

  function validateHintAnswer() {
    var hintAns = document.getElementById('hintAnswer');
    var hintAnsError = document.getElementById('hintAnsError');
    if (hintAns.value.trim() === '') {
      hintAnsError.style.display = 'inline';
      hintAns.style.border = "2px solid red";
      return false;
    } else {
      hintAnsError.style.display = 'none';
      hintAns.style.border = "2px solid green";
      return true;
    }
  }

function validateForm(){
    if(validateFName()  && validateSurname() && validateEmail() && validatePassword() && validateConfirmPassword() && validateHintAnswer()){
        return true;
    }
    else{
        return false;
    }
}
// const emailRegex =/^[A-Za-z!#$%&'*+\-/=?^_`{|}~]+@[A-Za-z]+\.[A-Za-z]{2,}$/;